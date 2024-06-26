package looping;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter a number");
        int numbe = num.nextInt();
        if ( numbe <= 20 ){
            System.out.println("Integer value");
        }
        else {
            System.out.println("Don't Khow");
        }
    }

}

