package exeptions;

public class ImpossibleModelExeption extends Exception{
    public ImpossibleModelExeption() {
    }

    public ImpossibleModelExeption(String message) {
        super(message);
    }

    public ImpossibleModelExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public ImpossibleModelExeption(Throwable cause) {
        super(cause);
    }

    public ImpossibleModelExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
