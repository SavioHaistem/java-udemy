import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Student> students = new HashSet<>();

        System.out.print("How many students for course A ?");
        int manyA = scan.nextInt();
        for (int count = 0;count < manyA;count++) {
            int id = scan.nextInt();
            Student student = new Student(id);
            students.add(student);
        }
        System.out.print("How many students for course B ?");
        int manyB = scan.nextInt();
        for (int count = 0;count < manyB;++count) {
            int id = scan.nextInt();
            Student student = new Student(id);
            students.add(student);
        }
        System.out.print("How many students for course C ?");
        int manyC = scan.nextInt();
        for (int count = 0;count < manyC;count++) {
            int id = scan.nextInt();
            Student student = new Student(id);
            students.add(student);
        }

        System.out.println(students.size());
    }
}