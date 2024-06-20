package predicates.predicates;

import java.util.List;
import java.util.function.Predicate;

public class main {
    public static void main(String[] args) {
        class BiggerThanFive<E> implements Predicate<Integer>{

            @Override
            public boolean test(Integer v) {
                Integer five = 5;
                return v > five;

            }
        }
        Object main = new Object();
        {
            List<Integer> nums = List.of(2,3,4,5,6,7);
            BiggerThanFive<Integer> btf = new BiggerThanFive<>();
            nums.stream().filter(btf).forEach(System.out::println);
        }
    }

}
