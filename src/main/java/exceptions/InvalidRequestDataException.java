package exceptions;

public class InvalidRequestDataException extends Exception{
    public InvalidRequestDataException(String message) {
        super(message);
    }
}
