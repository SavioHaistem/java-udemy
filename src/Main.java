import entities.LegalPerson;
import entities.Person;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int numberOfPayers = scan.nextInt();
        List<Person> personList = new ArrayList<>(numberOfPayers);

        for (int count = 1; count <= numberOfPayers; count++) {
            System.out.println("Tax payer #" + count + " data:");
            scan.nextLine();
            System.out.print("Individual or company (i/c)? ");
            char typedChar = scan.next().charAt(0);

            System.out.print("Name: ");
            scan.nextLine();
            String personName = scan.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = scan.nextDouble();

            if (typedChar == 'c') {
                System.out.print("Number of employees: ");
                int employeesCount = scan.nextInt();

                Person person = new LegalPerson(personName,anualIncome,employeesCount);
                personList.add(person);
            } else {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble();

                Person person = new PhysicalPerson(personName,anualIncome,healthExpenditures);
                personList.add(person);
            }
        }

        Double totalTaxes = 0.0;
        System.out.println("\n\n =============================== \n");
        System.out.println("TAXES PAID:");
        for (Person person : personList) {
            totalTaxes += person.calculateTax();
            System.out.println(person);
        }
        System.out.println("\n =============================== \n");
        System.out.printf("TOTAL TAXES: $%.2f",totalTaxes);
        System.out.println("\n =============================== \n\n");
    }
}