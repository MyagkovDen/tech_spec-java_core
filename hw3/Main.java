package hw3;


import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Petr", "Sales",
                "+7123456789", 55000.0, 35);
        Employee employee2 = new Employee("Ivan", "IT",
                "+7987654321", 75000.0, 50);
        Employee employee3 = new Employee("Maria", "Law",
                "+7123459876", 90000.0, 23);
        Employee employee4 = new Employee("Elena", "Sales",
                "+7123183876", 55000.0, 46);
        Employee employee5 = new Manager("Timur", "Administration",
                "+7123183876", 115000.0, 53);
        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5};

        LocalDate date1 = LocalDate.of(1995, 7, 12);
        LocalDate date2 = LocalDate.of(1997, 11, 15);

        int n = Employee.compare(date1, date2);
        System.out.println(n);

        System.out.println(Arrays.toString(employees));
        Manager.salaryUp(employees);
        System.out.println(Arrays.toString(employees));


    }
}
