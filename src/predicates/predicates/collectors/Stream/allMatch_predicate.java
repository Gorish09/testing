package predicates.predicates.collectors.Stream;

import java.util.List;
import java.util.function.Predicate;

public class allMatch_predicate {
    public static void main(String[] args) {
        var value1 = List.of(1,3,4,5,6,7);
        var value2 = List.of(4,5,3,-6,-7,3,2);

        Predicate<Integer> isPositive = e -> e >0;
        var res1 = value1.stream().allMatch(isPositive);

        if (res1) {
            System.out.println("All value is Positive ");
        }
        else {
            System.out.println("All value is not Positive");
        }

        var res2 = value2.stream().allMatch(isPositive);

        if (res2) {
            System.out.println("All value of Res2 is Positive");
        }
        else {
            System.out.println("All value of res2 is not Positive");
        }
    }
}
