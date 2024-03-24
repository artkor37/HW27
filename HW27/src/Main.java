import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //todo Тут протестить работу метода
        try {
            System.out.println(confirmPassword("te#st_123", "p#ass", "pass"));
        } catch (WrongLoginException e) {
           // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
           // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

    }


    //todo тут создать метод confirmPassword()
    public static boolean confirmPassword(String login,
                                          String password,
                                          String confirmPassword)
            throws WrongLoginException,
            WrongPasswordException{
        if (validateLoginorPassword(login)) {
            throw new WrongLoginException("Логин не соответствует требованиям");
        }
        if(validateLoginorPassword(password)){
            throw new WrongPasswordException("Пароль не соответствует требованиям!");
        }
        return password.equals(confirmPassword);
    }

    private static boolean validateLoginorPassword(String loginOrPass) {
        return !loginOrPass.matches("\\w+") || loginOrPass.length() >= 20;
    }
}