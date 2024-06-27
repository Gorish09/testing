package Program;

import java.util.Scanner;

public class WAP_to_Add_Two_integer {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter First Number");
        int num = number.nextInt();

        System.out.println("Enter Second Number");
        int num2 = number.nextInt();

        int result = num + num2;
        System.out.println(result);
    }
}
