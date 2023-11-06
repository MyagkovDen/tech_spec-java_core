package hw4.task2.entities;

import hw4.task2.exceptions.CustomerNotFoundException;
import hw4.task2.exceptions.GoodsNotFoundException;
import hw4.task2.exceptions.IncorrectCountException;

public class Bought {

    static int number;
    Customer[] customers;
    Goods[] goods;
    Order[] orders;

    public Bought() {
        number = 0;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public static int getNumber() {
        return number;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public Order[] getOrders() {
        return orders;
    }

    public boolean customerExists(String name) {
        for (Customer customer : customers
        ) {
            if (customer.getName().equals(name)) {
                return true;
            }
        }
        throw new CustomerNotFoundException();
    }

    public boolean goodsExists(String item) {
        for (Goods thisGoods : goods
        ) {
            if (thisGoods.getName().equals(item)) {
                return true;
            }
        }
        throw new GoodsNotFoundException();
    }

    public boolean countCorrect(int n) {
        if (n > 0) {
            return true;
        }
        throw new IncorrectCountException();
    }

    public Order makeBought(String name, String item, int count) {
        Order order = null;
        try {
            customerExists(name);
            goodsExists(item);
            countCorrect(count);
            order = new Order(name, item, count);
            number++;
            System.out.println("Покупатель " + name + " приобрел " + count + " " + item);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return order;
    }

}
