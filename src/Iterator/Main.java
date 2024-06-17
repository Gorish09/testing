package Iterator;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Abhishek");
        name.add("Rohit");
        name.add("Virat Kohli");
        name.add("Sachin");

        Iterator<String> hi = name.iterator();

        System.out.println(hi.next());

        while (hi.hasNext()) {
            System.out.println(hi.next());
        }


    }
}
