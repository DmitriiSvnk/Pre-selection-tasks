package subtask1;

import java.util.Scanner;

public class CalculatorUser {
    private Scanner scanner = new Scanner(System.in);
    private double arg1;
    private double arg2;
    private char action;
    private double result;

    public void work() {
    System.out.println("Введите первый аргумент:");
    arg1 = scanner.nextDouble();
    System.out.println("Введите второй аргумент:");
    arg2 = scanner.nextDouble();
    System.out.println("Введите символ желаемой операции: \n\"+\" - для сложения,  \n\"-\" - для вычетания, \n\"*\" - для умножения, \n\"/\" - для деления, \n\"%\" - для деления по модулю.");
    action = scanner.next().charAt(0);
    result = Calculator.calculate(arg1, arg2, action);
    System.out.println("Результат вычисления = " + result);
    }
}
