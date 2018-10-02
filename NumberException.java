package src;

public class NumberException extends Exception {
    private String message;

    NumberException(String message){
        super(message);
    }
}
