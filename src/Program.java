import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter departament's name: ");
        String departamentName = scan.nextLine();
        Department workerDepartament = new Department(departamentName);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scan.nextLine();

        System.out.print("Level: (1 to 3): ");
        String level = scan.nextLine();
        WorkLevel workerlevel = WorkLevel.valueOf(level);
        

        System.out.print("Base Salary: ");
        Double baseSalary = scan.nextDouble();

        Worker worker = new Worker(workerName,workerlevel,baseSalary,workerDepartament);
        System.out.println(worker);
    }
}