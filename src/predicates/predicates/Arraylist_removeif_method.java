package predicates.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Arraylist_removeif_method {
     public static void main(String[]args){
        var words = new ArrayList<String>();
        words.add("sky");
        words.add("warm");
        words.add("winter");
        words.add("cloud");
        words.add("pen");
        words.add("tree");

        Predicate<String> hasThreeChair = word -> word.length() == 3;
        words.removeIf(hasThreeChair);

        System.out.println(words);
    }
}
