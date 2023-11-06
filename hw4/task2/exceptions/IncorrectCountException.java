package hw4.task2.exceptions;

public class IncorrectCountException extends RuntimeException{
    public IncorrectCountException() {
        super("Некорректно указано количество товара");
    }
}
