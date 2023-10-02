package Aplication;
import java.util.Scanner;
import util.calculator;

public class firstStatickClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o radio");
        double radius = scan.nextDouble();

        double resultRadio = calculator.circumference(radius);
        double resultVolume = calculator.volume(radius);
        System.out.printf("PI = %.2f%n", calculator.PI);
        System.out.printf("PI = %.2f%n", resultRadio);
        System.out.printf("PI = %.2f%n", resultVolume);
    }
}
