package hw5.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", List.of(4, 5, 4, 5, 4), "History");
        Student student2 = new Student("Petr", List.of(4, 4, 5, 3, 4), "IT");
        Student student3 = new Student("Maria", List.of(3, 4, 4, 3, 4), "IT");
        Student student4 = new Student("Zahar", List.of(5, 4, 5, 4, 4), "IT");
        Student student5 = new Student("Alex", List.of(5, 5, 5, 5, 5), "IT");
        Student student6 = new Student("Elena", List.of(5, 4, 5, 5, 4), "IT");
        Student student7 = new Student("Nikita", List.of(5, 5, 5, 5, 5), "Law");
        Student student8 = new Student("Zlata", List.of(5, 4, 5, 5, 5), "IT");
        Student student9 = new Student("Ariadna", List.of(5, 4, 5, 5, 4), "IT");
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);

        List<Student> grades = Student.getAverageGrade(students);
        System.out.println(grades);

    }
}
