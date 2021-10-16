package home.work12.loginUser;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
