package Exception;

public class int_catch_final {
    public static void main(String[] args) {
        try {
            int[] Numbers = {1, 2, 3};
            System.out.println(Numbers[1]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
