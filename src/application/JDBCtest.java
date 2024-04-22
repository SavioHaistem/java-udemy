package application;

import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtest {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            connection = DB.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM department");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("Id") + ", " + resultSet.getString("Name"));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } finally {
            DB.closeResultSet(resultSet);
            DB.closeStatment(statement);
            DB.closeConnection();
        }
    }
}
