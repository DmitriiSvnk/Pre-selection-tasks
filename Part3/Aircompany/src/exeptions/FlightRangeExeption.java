package exeptions;

public class FlightRangeExeption extends Exception{
    public FlightRangeExeption() {
    }

    public FlightRangeExeption(String message) {
        super(message);
    }

    public FlightRangeExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public FlightRangeExeption(Throwable cause) {
        super(cause);
    }

    public FlightRangeExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
