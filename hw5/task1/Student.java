package hw5.task1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;
    private String speciality;

    public List<Integer> getGrades() {
        return grades;
    }

    public String getSpeciality() {
        return speciality;
    }

    public Student(String name, List<Integer> grades, String speciality) {
        this.name = name;
        this.grades = grades;
        this.speciality = speciality;
    }

    public static List<Student> getAverageGrade(List<Student> students) {
        List<Student> sortedStudents = students.stream().filter(student ->
                (student.getAverage(student.getGrades()) > 4.5) && (
                        student.getSpeciality().equals("IT")))
                .sorted(Collections.reverseOrder(
                        Comparator.comparing(student -> student.getAverage(student.getGrades()))))
                .limit(5)
                .toList();
        return sortedStudents;
    }

    public Double getAverage(List<Integer> grades) {
        return (double) grades.stream().mapToDouble(e1 -> e1).average().getAsDouble();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}