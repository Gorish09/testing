package predicates.predicates.collectors.Patten;

import java.util.List;
import java.util.regex.Pattern;

public class asMatchPredicate {
    public static void main(String[] args) {
        var words = List.of("book","bookshelf","bookworm",
                "bookcase","booklish","bookkeeper","booklet","bookmark");

        var pred = Pattern.compile("book(worm|mark|keeper|let)?").asMatchPredicate();
        words.stream().filter(pred).forEach(System.out::println);
    }
}
