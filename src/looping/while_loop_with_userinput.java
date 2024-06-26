package looping;

import java.util.Scanner;

public class while_loop_with_userinput {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        int n = 1;
        while (n<num){
            System.out.println(n);
            n+=1;
        }

    }

}
