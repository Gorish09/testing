package Pattern_Alphabets;

public class Pattern_of_c {
    public static void main(String[] args) {
        for (int r = 1; r <= 7; r++) {
            for (int c = 1; c <= 5; c++) {
                if (c == 1 || (r == 1 && c < 5) || (r == 7 && c < 5)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
