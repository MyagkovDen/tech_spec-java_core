package hw4.task1.checks;

import hw4.task1.exceptions.WrongConfirmPasswordException;
import hw4.task1.exceptions.WrongLoginException;
import hw4.task1.exceptions.WrongPasswordLengthException;

public class Check {

    public static boolean checkLogin(String login) {
        if (login.length() < 20) {
            return true;
        } else {
            throw new WrongLoginException(login);
        }
    }

    public static boolean checkPassword(String password, String confirmPassword) {
        if (password.length() > 20) {
            throw new WrongPasswordLengthException(password);
        } else if (!password.equals(confirmPassword)) {
            throw new WrongConfirmPasswordException();
        } else {
            return true;
        }
    }
}
