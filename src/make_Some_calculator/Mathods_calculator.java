package make_Some_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mathods_calculator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        try {
            System.out.println("Enter the operator (+, -, /, *, %, ^): ");
            char operator = number.next().charAt(0);

            Mathods_calculator methods = new Mathods_calculator();
            if (!methods.Operator(operator)) {
                throw new IllegalArgumentException("Invalid operator");
            }


            System.out.println("Enter first number: ");
            double x = number.nextDouble();

            double y = 0;
            if (operator != '^') {
                System.out.println("Enter second number: ");
                y = number.nextDouble();
            }

            double result = methods.calculate(operator, x, y);
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            number.close();
        }
    }
    public static boolean Operator(char operator) {
        return operator == '+' || operator == '-' || operator == '/' || operator == '*' || operator == '%' || operator == '^';
    }


    public static double calculate(char operator, double x, double y) throws Exception {
        switch (operator) {
            case '+':
                Mathods_calculator methods = new Mathods_calculator();
                return add(x, y);
            case '-':
                return subtract(x, y);
            case '/':
                return divide(x, y);
            case '*':
                return multiply(x, y);
            case '%':
                return modulus(x, y);
            case '^':
                return power(x, y);
            default:
                throw new Exception("Unknown operator: " + operator);
        }
    }
    public static double add(double x, double y) {
        return x + y;
    }


    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }


    public static double divide(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("Division by zero is not allowed");
        }
        return x / y;
    }
    public static double modulus(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("Modulus by zero is not allowed");
        }
        return x % y;
    }

    public static double power(double x, double y) {
        return Math.pow(x, 2);
    }
}


