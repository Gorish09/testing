package predicates.predicates.collectors.Stream;

import java.util.List;
import java.util.function.Predicate;

public class predicate_with_multiple_condition {
    public static void main(String[] args) {
        var countries = List.of(
                new country("Iran",1455545541),
                new country("Hungry",44444444),
                new country("poland",333333));
        Predicate<country> p1 = c-> c.name().startsWith("I") &&
                c.population() > 10000;

        countries.stream().filter(p1).forEach(System.out::println);
    }
    record country (String name , int population){

    }
}
