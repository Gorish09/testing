package make_Some_calculator;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first name ");
        String a , b ;
        a = number.next();


        System.out.println("Enter last name");
        b = number.next();
        System.out.println("Your name is "+a  +" "+ b);
    }
}
