package student;
import java.util.Scanner;
import student.Student;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Digite o nome do aluno");
        student.name = scan.nextLine();

        System.out.println("Digite a nota do primeiro trimestre (max 30)");
        student.firstQuarter = scan.nextDouble();

        System.out.println("Digite a nota do segundo trimestre (max 35)");
        student.secondQuarter = scan.nextDouble();

        System.out.println("Digite a nota do terceiro trimestre (max 35)");
        student.thirdQuarter = scan.nextDouble();

        System.out.println(student);
    }
}
