package application;
import java.util.Scanner;
import entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Enter the measures of triangle Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();


        double xP = calcP(x.a, x.b, x.c);
        double yP = calcP(y.a, y.b, y.c);

        double areaX = calculateArea(xP,x.a,x.b,x.c);
        double areaY = calculateArea(yP,y.a,y.b,y.c);

        System.out.printf("the area of triangle X is: %.4f%n",areaX);
        System.out.printf("the area of triangle Y is: %.4f%n", areaY);
    }

    static double calcP(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    static double calculateArea(double p, double a, double b, double c) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
