import java.util.logging.Level;
public class Enum {
    enum level{
        Low,
        medium,
        high
    }

    public static void main(String[] args) {
        Level myvar = Level.ALL;
        System.out.println(myvar);
    }
}