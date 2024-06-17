package List_Sorting;
import java.util.Collections;
import java.util.ArrayList;

public class ascending_order {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Rahul");
        name.add("Ajay");
        name.add("Gorish");
        name.add("Arjun");
        name.add("Animesh");

        Collections.sort(name);

        for (String i : name) {
            System.out.println(i);
        }
    }
}
