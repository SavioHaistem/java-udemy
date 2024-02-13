import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Student> students = new HashSet<>();


        System.out.print("How many students for course A ? ");
        int countA = scan.nextInt();
        for (int count = 0; count < countA; count++) {
            int id = scan.nextInt();
            Student student = new Student(id);
            students.add(student);
        }

        System.out.print("How many students for course B ? ");
        int countB = scan.nextInt();
        for (int count = 0; count < countB; count++) {
            int id = scan.nextInt();
            Student student = new  Student(id);
            students.add(student);
        }

        System.out.print("How many students for course C ? ");
        int countC = scan.nextInt();
        for (int count = 0; count < countC; count++) {
            int id = scan.nextInt();
            Student student = new Student(id);
            students.add(student);
        }

        System.out.println("Plataform students: ");
        for (Student student : students) {
            System.out.println("Student: " + student.getId());
        }
    }
}