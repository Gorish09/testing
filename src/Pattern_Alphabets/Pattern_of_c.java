package Pattern_Alphabets;

public class Pattern_of_c {
    public static void main(String[] args) {
        for (int r = 1; r <= 7; r++) {
            for (int c = 1; c <= 9; c++) {
                if (c == 1 || (r == 1 && c < 9) || (r == 7 && c < 9)) {
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
