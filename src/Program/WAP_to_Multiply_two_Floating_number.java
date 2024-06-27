package Program;

import java.util.Scanner;

public class WAP_to_Multiply_two_Floating_number {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter first float number");
        float num = number.nextFloat();

        System.out.println("Enter Second Float Number");
        float num2 = number.nextFloat();

         float result =  num * num2;
        System.out.println(result);

    }
}
