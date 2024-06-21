package predicates.predicates.collectors.Stream.predicate;

import java.util.List;
import java.util.function.Predicate;

public class isEqual_method {
    public static void main(String[] args) {
        var users1 = List.of(new User("John Doe", "gardener"),
                new User("Roger Roe", "driver"), new User("Jane Doe", "teacher"));

        var users2 = List.of(new User("John Doe", "gardener"),
                new User("Roger Roe", "driver"), new User("Jane Doe", "teacher"));

        var users3 = List.of(new User("John Doe", "architect"),
                new User("Roger Roe", "driver"), new User("Jane Doe", "teacher"));

        Predicate<List<User>> pred = Predicate.isEqual(users1);

        if (pred.test(users2)) {
            System.out.println("users1 and user2 are equal");
        } else {
            System.out.println("users1 and user2 are not equal");
        }

        if (pred.test(users3)) {
            System.out.println("users1 and user3 are equal");
        } else {
            System.out.println("users1 and user3 are not equal");
        }
    }

    public record User(String name, String occupation) {
    }
}
