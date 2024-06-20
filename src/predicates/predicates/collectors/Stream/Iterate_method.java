package predicates.predicates.collectors.Stream;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Iterate_method {
    public static void main(String[] args) {
        Predicate<Double> pred = e -> e < 600;
        UnaryOperator<Double> op = e -> e * 2;

        Stream.iterate(1d, pred, op).forEach(System.out::println);
    }
    }

