import entities.enums.OrderStatus;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date orderMoment = new Date();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cliente data: ");

        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        String birthDate = scan.nextLine();

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.nextLine());
        System.out.print("How many items to this order ? ");
        int orderQuant = scan.nextInt();
        scan.nextLine();

        for (int times = 0; times < orderQuant; times++) {
            System.out.println("Enter the #" + (times + 1) + " item Data: ");
            System.out.print("Product name: ");
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            Double productPrice = scan.nextDouble();
            System.out.print("quantities: ");
            Integer quantity = scan.nextInt();
            scan.nextLine();
        }
    }
}