import model.entities.Resevation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Room number: ");
            int roomNumber = scanner.nextInt();
            System.out.print("check-in date: ");
            scanner.nextLine();
            Date checkInDate = dateFormat.parse(scanner.nextLine());
            System.out.print("check-out date: ");
            Date checkOutDate = dateFormat.parse(scanner.nextLine());
            if (checkOutDate.before(checkInDate)) {
                throw new DomainException("A data de logout deve ser depois da data de login");
            }

            Resevation reserve = new Resevation(roomNumber,checkInDate,checkOutDate);
            reserve.updateDates(dateFormat.parse("19/01/1999"),dateFormat.parse("20/01/1999"));
            System.out.println(reserve);
        } catch (ParseException | DomainException e) {
            System.err.println(e.getMessage());
        }
    }
}