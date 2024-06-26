package palindrome;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        String input = sc.nextLine();

        String Input = input.replaceAll("^a-zA-Z0-9", "").toLowerCase();

        if (isPalindrome(Input)) {
            System.out.println(input + "is a palindeome.");
        }
        else {
            System.out.println(input + "is not a palindrome" );
        }
    }
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


}