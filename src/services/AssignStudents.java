package services;

import entities.Course;
import entities.Student;

import java.util.Scanner;

public class AssignStudents {
    Scanner scan = new Scanner(System.in);
    public void assign(Course course, Integer studentsCount) {
        for (int count = 0; count > studentsCount;count++) {
            int studentId = scan.nextInt();
            Student student = new Student(studentId);
            course.addStudent(student);
        }
    }

    public AssignStudents() {}
}