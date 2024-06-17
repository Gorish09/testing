package List_Sorting;
import java.util.Collections;
import java.util.ArrayList;

public class city_names_reverse_order {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<String>();
        city.add("Gurdaspur");
        city.add("Dorangla");
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Hyderabad");


        Collections.sort(city , Collections.reverseOrder());

        for ( String i : city) {
            System.out.println(i);
        }
    }
}
