import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat defaultDateFormat = new SimpleDateFormat("dd/MM/yyyy");

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
            System.out.println("Enter contract #" + (count + 1) + " data");
            System.out.print("Date (DD/MM/YYYY): ");
            scan.nextLine();
            String dateStringGetter = scan.nextLine();
            Date contractDate = defaultDateFormat.parse(dateStringGetter);

            System.out.print("Value per hour: ");
            Double valuePerHour = scan.nextDouble();

            System.out.println("Duration: ");
            Integer duration = scan.nextInt();

            HourContract contract = new HourContract(contractDate,valuePerHour,duration);
            System.out.println(contract);
        }
    }
}