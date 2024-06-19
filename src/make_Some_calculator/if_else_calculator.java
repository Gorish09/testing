package make_Some_calculator;

import java.util.Scanner;


public class if_else_calculator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter the operator ( + ,- , / ,* ,% ,^ ) ");

        char operator = number.next().charAt(0);

        if (operator == '+' || operator == '-' || operator == '/' || operator == '*' || operator == '%' || operator == '^') {
            System.out.println("Enter the first number ");

            double a = number.nextDouble();

            double b = 0;
            if (operator != '^') {

                System.out.println("Enter the second number");
                b = number.nextDouble();
            }

            solve(a, b, operator);
        }
        else {
            System.out.println(" Please enter a valid operator");
        }
    }

    public static double solve(double a, double b, char operator) {
        double result = 0;
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Error: Division by zero");
            }
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '%') {
            result = a % b;

        } else if (operator == '^') {
            result = Math.pow(a, 2);
        }
        System.out.println("your number is " + result);
        return result;

    }
}