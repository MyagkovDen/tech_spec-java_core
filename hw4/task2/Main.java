package hw4.task2;

import hw4.task2.entities.Bought;
import hw4.task2.entities.Customer;
import hw4.task2.entities.Goods;
import hw4.task2.entities.Order;
import hw4.task2.exceptions.CustomerNotFoundException;
import hw4.task2.exceptions.GoodsNotFoundException;
import hw4.task2.exceptions.IncorrectCountException;

public class Main {

    public static void main(String[] args) {
        Bought bought = new Bought();
        int n = 0;
        Customer customer1 = new Customer("Ivan", 27);
        Customer customer2 = new Customer("Masha", 22);
        Customer customer3 = new Customer("Petr", 34);
        Goods item1 = new Goods(1, "Milk");
        Goods item2 = new Goods(2, "Bread");
        Goods item3 = new Goods(3, "Chocolate");

        bought.setCustomers(new Customer[]{customer1, customer2, customer3});
        bought.setGoods(new Goods[]{item1, item2, item3});

        bought.makeBought("Ivan", "Bread", 2);
        bought.makeBought("Sergei", "Milk", 1);
        bought.makeBought("Petr", "Milk", -2);
        bought.makeBought("Masha", "Apples", 3);
        bought.makeBought("Masha", "Chocolate", 1);

        System.out.println("За сегодняшний день совершено " + Bought.getNumber() + " покупок");


    }

}
