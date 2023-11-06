package hw4.task1.exceptions;

public class WrongConfirmPasswordException extends WrongPasswordException{
    public WrongConfirmPasswordException() {
        System.out.println("Пароль и его подтверждение не совпадают!");
    }
    public WrongConfirmPasswordException(String message) {
        System.out.println("Пароль " + message + " и его подтверждение не совпадают!");
    }
}
