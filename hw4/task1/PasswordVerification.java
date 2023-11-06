package hw4.task1;

import hw4.task1.checks.Check;
import hw4.task1.exceptions.WrongConfirmPasswordException;
import hw4.task1.exceptions.WrongLoginException;
import hw4.task1.exceptions.WrongPasswordLengthException;

public class PasswordVerification {

    public static boolean checkPassword(String login, String password, String confirmPassword) throws WrongConfirmPasswordException {

        try {
            Check.checkLogin(login);
            Check.checkPassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordLengthException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
