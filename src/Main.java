import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat factoredDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");

        int productQuantity = scan.nextInt();
        ArrayList<Product> products = new ArrayList<>(productQuantity);

        for (int counter = 0; counter < productQuantity; counter++) {
            System.out.println("Enter product #" + (counter + 1) + " data: " );
            System.out.print("Common used or imported (c/u/i) ? ");
            scan.nextLine();
            String productType = scan.nextLine();
            System.out.print("Enter product name: ");
            String productName = scan.nextLine();
            System.out.print("Enter product price: ");
            Double productPrice = scan.nextDouble();


            if ( productType.charAt(0) == 'i') {
                System.out.print("Enter product customs fee: ");
                Double customsFee = scan.nextDouble();

                Product product = new ImportedProduct(productName,productPrice,customsFee);
                products.add(product);

            } else if (productType.charAt(0) == 'u') {
                System.out.print("Enter the factored date (dd/mm/aaaa): ");
                scan.nextLine();
                Date factoredDate = factoredDateFormat.parse(scan.nextLine());

                Product product = new UsedProduct(productName,productPrice,factoredDate);
                products.add(product);
            } else {
                Product product = new Product(productName,productPrice);
                products.add(product);
            }
        }

        System.out.println("PRICE TAGS: ");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}