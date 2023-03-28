package checkNr;

public class InvalidRangeException extends Throwable {

    public InvalidRangeException(String errorInRage) {
        System.err.println(" min >= max !!!");
    }
}
