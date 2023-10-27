import entyties.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employers are there in your company ? ");
        int manyEmployes = scan.nextInt();

        for (int count=0; count < manyEmployes; count++) {
            scan.nextLine();
            System.out.print("Type employee #" + (count + 1) + " name: " );
            String name = scan.nextLine();
            System.out.print("Type employee #" + (count + 1) + " id: " );
            Integer id = scan.nextInt();
            System.out.print("Type employee #" + (count + 1) + " salary: " );
            Double salary = scan.nextDouble();

            Employee employee = new Employee(name,id,salary);
            employees.add(employee);
        }

        System.out.println("Employess List");
        for (Employee employee: employees) {
            System.out.println("----------------------------");
            System.out.printf("Employee #%d %nid: %d, %nname: %s, %nsalary: %.2f%n", employees.lastIndexOf(employee)+1, employee.getId(), employee.name, employee.getSalary());
            System.out.println("----------------------------");
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        Integer increaseID = scan.nextInt();
        System.out.print("Enter the increase value: ");
        Double increasedValue = scan.nextDouble();

        employees.stream().filter(employee -> increaseID.equals(employee.getId())).forEach(employee -> employee.increaseSalary(increasedValue));

        System.out.println("Employess List");
        for (Employee employee: employees) {
            System.out.println("----------------------------");
            System.out.printf("Employee #%d %nid: %d, %nname: %s, %nsalary: %.2f%n", employees.lastIndexOf(employee)+1, employee.getId(), employee.name, employee.getSalary());
            System.out.println("----------------------------");
        }
    }
}