package hw4.task1.exceptions;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
        System.out.println("Длина логина должна быть меньше 20 символов!");
    }

    public WrongLoginException(String login) {
        super("Длина логина должна быть меньше 20 символов!  Длина вашего логина " + login.length() + " символов");
    }
}
