package make_Some_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods_calculator {


    private boolean operator;

    public static void main(String[] args) throws Exception {
        Scanner number = new Scanner(System.in);

        try {
            System.out.println("Enter the operator ( + , - , / , * , % , ^ )");
            char operator = number.next().charAt(0);

            Methods_calculator methods = new Methods_calculator();
            if (methods.operator) {

                throw new Exception("Invalid operator");
            }


            System.out.println("Enter first number: ");
            double x = number.nextDouble();

            double y = 0;
            if (operator != '^') {
                System.out.println("Enter second number: ");
                y = number.nextDouble();
            }
            double result = methods.operator(operator, x, y);
            System.out.println("result:" + result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    private double operator(char operator, double x, double y) {
        return x;
    }
}




