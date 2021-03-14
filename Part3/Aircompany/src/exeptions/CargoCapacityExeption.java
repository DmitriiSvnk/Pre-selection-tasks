package exeptions;

public class CargoCapacityExeption extends Exception{
    public CargoCapacityExeption() {
    }

    public CargoCapacityExeption(String message) {
        super(message);
    }

    public CargoCapacityExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public CargoCapacityExeption(Throwable cause) {
        super(cause);
    }

    public CargoCapacityExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
