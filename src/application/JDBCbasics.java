package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JDBCbasics {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DB.getConnection();
            statement = connection.prepareStatement(
                    "INSERT INTO seller "
                       + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                       + "VALUES "
                       + "(?,?,?,?,?)"
            ,statement.RETURN_GENERATED_KEYS);
            statement.setString(1,"Savio");
            statement.setString(2,"savio.dantas.5858@gmail.com");
            statement.setDate(3,new java.sql.Date(simpleDateFormat.parse("15/04/2002").getTime()));
            statement.setDouble(4,3000.0);
            statement.setInt(5,4);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    System.out.println("Done: id = " + id);
                }
            } else {
                System.out.println("no rows affected");
            }
        } catch (SQLException | ParseException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatment(statement);
            DB.closeConnection();
        }
    }
}
