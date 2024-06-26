package looping;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println ("starting loop:");
        for (int n = 0; n < 7; ++n)
        {
            System.out.println ("in loop: " + n);
            if (n == 2) {
                continue;
            }
            System.out.println ("   survived first guard");
            if (n == 4) {
                continue;
            }
            System.out.println ("   survived second guard");
            if (n == 6) {
                break;
            }

        }

        System.out.println ("end of loop or exit via break");
    }
}
