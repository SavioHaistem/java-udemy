import java.util.Scanner;
import products.Product;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Product product = new Product();
        product.name = scan.nextLine();
        product.quant = scan.nextInt();
        product.price = scan.nextDouble();


    }
}
