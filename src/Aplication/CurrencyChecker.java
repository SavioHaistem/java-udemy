package Aplication;
import util.CurrencyConversor;
import java.util.Scanner;

public class CurrencyChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite o valor da moeda");
        double value = scan.nextDouble();
        System.out.println("digite quantas moedas voce ira comprar");
        double quantity = scan.nextDouble();
        System.out.println(CurrencyConversor.calculate(quantity,value));
    }
}
