package hw4.task2.exceptions;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException() {
        super("Такого покупателя не существует");
    }
}
