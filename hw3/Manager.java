package hw3;

public class Manager extends Employee {


    public Manager(String name, String department, String phone, Double salary, int age) {
        super(name, department, phone, salary, age);
    }

    public static void salaryUp(Employee[] employees) {
        for (Employee emp : employees) {
            if ((emp.getAge() > 45) && (emp.getClass() != Manager.class)) {
                emp.setSalary(emp.getSalary() + 5000);
            }
        }
    }
}

