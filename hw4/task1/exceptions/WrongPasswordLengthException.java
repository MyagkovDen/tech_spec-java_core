package hw4.task1.exceptions;

public class WrongPasswordLengthException extends WrongPasswordException{
    public WrongPasswordLengthException() {
        System.out.println("Длина пароля должна быть меньше 20 символов!");
    }
    public WrongPasswordLengthException(String message) {
        System.out.println("Длина пароля должна быть меньше 20 символов!  Длина вашего пароля " + message.length() +
                 " символов");
    }
}
