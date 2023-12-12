import entities.Employe;
import entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int manyemployees = scan.nextInt();
        ArrayList<Employe> employes = new ArrayList<>(manyemployees);

        for (int count = 0; count < manyemployees; count++) {
            System.out.println("Employee #" + (count + 1) + " data:");

            System.out.print("Outsourced ? ");
            scan.nextLine();
            boolean outsourced = scan.nextLine().equals("y");
            System.out.print("name: ");
            String name = scan.nextLine();
            System.out.print("hours: ");
            Integer hours = scan.nextInt();
            System.out.print("value per hour: ");
            Double valueperhour = scan.nextDouble();

            if (outsourced) {
                System.out.print("Additional charge: ");
                Double additional = scan.nextDouble();

                Employe employee = new OutSourcedEmployee(name,hours,valueperhour,additional);
                employes.add(employee);
            } else {
                Employe employee = new Employe(name,hours,valueperhour);
                employes.add(employee);
            }
        }

        System.out.println("Payments: ");
        for (Employe employee : employes) {
            System.out.printf("%s - $ %.2f%n",employee.getName(),employee.payment());
        }
    }

}