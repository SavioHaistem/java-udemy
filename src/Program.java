import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter formatDefaultDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatIncome = DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departamentName = scan.nextLine();
        Department workerDepartament = new Department(departamentName);

        System.out.println("Enter worker data");
        System.out.print("Name: ");
        String workerName = scan.nextLine();

        System.out.print("Level: (1 to 3): ");
        String level = scan.nextLine();
        WorkLevel workerlevel = WorkLevel.valueOf(level);


        System.out.print("Base Salary: ");
        Double baseSalary = scan.nextDouble();

        System.out.print("How many contracts do this worker ? ");
        int contractsQuantity = scan.nextInt();

        for (int count = 0; count < contractsQuantity; count++) {
            System.out.println("Enter contract #" + count + " data");
            System.out.print("Date (DD/MM/YYYY): ");
            scan.nextLine();
            String contractDate = scan.nextLine();
            Date date = (Date) formatDefaultDate.parse(contractDate);

            System.out.print("Value per hour: ");
            Double valuePerHour = scan.nextDouble();

            System.out.println("Duration: ");
            Integer duration = scan.nextInt();

            HourContract contract = new HourContract(date,valuePerHour,duration);
            System.out.println(contract);
        }
    }
}