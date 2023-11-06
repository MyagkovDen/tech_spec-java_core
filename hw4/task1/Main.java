package hw4.task1;

public class Main {

    public static void main(String[] args) {
        String login = "user";
        String password = "123";
        String confirmPassword = "12";

        System.out.println(PasswordVerification.checkPassword(login, password, confirmPassword));
    }




}
