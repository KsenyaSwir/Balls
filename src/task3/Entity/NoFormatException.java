package task3.Entity;

public class NoFormatException extends Exception {
    public NoFormatException(String msg) {
        super(msg);
    }

    public NoFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoFormatException(Throwable cause) {
        super(cause);
    }
}
