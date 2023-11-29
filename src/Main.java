import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date orderMoment = new Date();
        SimpleDateFormat birthDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cliente data: ");

        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = birthDateFormat.parse(scan.nextLine());

        Client client = new Client(birthDate,name,email);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.nextLine());
        System.out.print("How many items to this order ? ");
        int orderQuant = scan.nextInt();
        scan.nextLine();

        Order order = new Order(orderMoment,status,client);

        for (int times = 0; times < orderQuant; times++) {
            System.out.println("Enter the #" + (times + 1) + " item Data: ");
            System.out.print("Product name: ");
            String productName = scan.nextLine();
            System.out.print("Product price: ");
            Double productPrice = scan.nextDouble();
            System.out.print("quantities: ");
            Integer quantity = scan.nextInt();
            scan.nextLine();

            Product product = new Product(productName,productPrice);
            OrderItem orderItem = new OrderItem(quantity,productPrice,product);

            order.addOrder(orderItem);
        }
        System.out.println(order);
    }
}