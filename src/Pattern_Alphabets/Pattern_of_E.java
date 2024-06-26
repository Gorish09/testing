package Pattern_Alphabets;

public class Pattern_of_E {
    public static void main(String[] args) {
        for (int r = 1; r <= 7; r++) {
            for (int c = 1; c <= 7; c++) {
                if (c == 1 || r ==1 || r ==4|| r==7) {
                    System.out.print(" #");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
