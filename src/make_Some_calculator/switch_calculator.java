package make_Some_calculator;

import java.util.Scanner;

public class switch_calculator {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter the operator ( + ,- , / ,* ,% ,^ ) ");
        char operator = number.next().charAt(0);

        if (operator != '+' && operator != '-' && operator != '/' && operator != '*' && operator != '%' && operator != '^') {
            System.out.println(" Please enter a valid operator");
            return;
        }

        System.out.println("Enter first number");
        double x = number.nextDouble();

        double y = 0;
        if (operator != '^') {
            System.out.println("Enter second number");
            y = number.nextDouble();
        }

        double result;
        switch (operator) {
                case '+':
                    result = x + y;
                    System.out.println(result);
                    break;

                case '-':
                    result = x - y;
                    System.out.println(result);
                    break;

                case '*':
                    result = x * y;
                    System.out.println(result);
                    break;

                case '/':
                    result = x / y;
                    System.out.println(result);
                    break;

                case '%':
                    result = x % y;
                    System.out.println(result);
                    break;

                case '^':
                    result = Math.pow(x , 2);
                    System.out.println(result);
                    break;

            default:
                System.out.println("Invalid operator");
                break;
            }
            number.close();
        }
    }
