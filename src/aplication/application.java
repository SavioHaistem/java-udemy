package aplication;

import services.PrintService;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("how many numbers: ");
        int manyNumbers = scan.nextInt();

        PrintService printService = new PrintService(manyNumbers);
        for (int count = 0; count < manyNumbers; count++) {
            System.out.print("type " + (count + 1) + " number: ");
            int number = scan.nextInt();
            printService.addNumber(number);
        }
        printService.print();
        System.out.println("First: " + printService.first());
    }
}