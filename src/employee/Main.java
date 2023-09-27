package employee;
import  java.util.Scanner;
import employee.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Digite o nome do funcionario :");
        employee.name = scan.nextLine();
        System.out.println("Digite o salario do funcionario :");
        employee.Salary = scan.nextDouble();
        System.out.println("Digite a quantidade abatida por taxas para este funcionario :");
        employee.tax = scan.nextDouble();

        System.out.println(employee);

        System.out.println("Digite a porcentagem para aumento de salario deste funcionario :");
        employee.IncreaseSalary(scan.nextDouble());

        System.out.println(employee);
    }
}
