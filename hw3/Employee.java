package hw3;

import java.time.LocalDate;

public class Employee {
    private String name;
    private String department;
    private String phone;
    private Double salary;
    private int age;

    public Employee(String name, String department, String phone, Double salary,
                    int age) {
        this.name = name;
        this.department = department;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static int compare(LocalDate date1, LocalDate date2) {
        return date1.compareTo(date2);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void getInfo(){
        System.out.println(this);
    }
}
