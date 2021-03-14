package subtask1;

public class Calculator {
    public static double calculate(double arg1,  double arg2, char action) {
        double result;

        switch (action){
            case '+': result = addition(arg1, arg2); break;
            case '-': result = subtract(arg1, arg2); break;
            case '*': result = multiply(arg1, arg2); break;
            case '/': result = divide(arg1, arg2); break;
            case '%': result = module(arg1, arg2); break;
            default:
                throw new IllegalStateException("Unexpected value: " + action);
        }

        return result;
    }

    private static double addition(double arg1, double arg2){
        return arg1 + arg2;
    }

    private static double subtract(double arg1, double arg2){
        return arg1 - arg2;
    }

    private static double multiply(double arg1, double arg2){
        return arg1 * arg2;
    }

    private static double divide(double arg1, double arg2){
        return arg1 / arg2;
    }

    private static double module(double arg1, double arg2){
        return arg1 % arg2;
    }
}
