package hw4.task2.exceptions;

public class GoodsNotFoundException extends RuntimeException{
    public GoodsNotFoundException() {
        super("Такого товара не существует");
    }
}
