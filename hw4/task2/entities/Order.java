package hw4.task2.entities;

import java.time.LocalDate;

public class Order {
    String customerName;
    String item;
    int count;

    public Order(String customerName, String item, int count) {
        this.customerName = customerName;
        this.item = item;
        this.count = count;
    }
}
