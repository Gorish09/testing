package java_strings;

import java.util.Scanner;

public class user_input_String {
    public static void main(String[] args) {
        Scanner add = new Scanner(System.in);

        System.out.println("Enter first name ");
        String a , b ;
        a = add.next();


        System.out.println("Enter last name");
        b = add.next();
        System.out.println("Your name is "+a  +" "+ b);
    }
}

