package exceptions;

public class WrongPasswordException extends Exception{
    //todo реализовать свое исключение

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
