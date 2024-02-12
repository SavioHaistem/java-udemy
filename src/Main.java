import entities.Course;
import services.AssignStudents;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Course A = new Course("A");
        Course B = new Course("B");
        Course C = new Course("C");
        AssignStudents assignStudents = new AssignStudents();

        System.out.print("How many students for course A ?");
        int countA = scan.nextInt();
        assignStudents.assign(A,countA);

        System.out.print("How many students for course B ?");
        int countB = scan.nextInt();
        assignStudents.assign(B,countB);

        System.out.print("How many students for course C ?");
        int countC = scan.nextInt();
        assignStudents.assign(C,countC);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}