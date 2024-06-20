package predicates.predicates.collectors;

import java.util.List;
import java.util.regex.Pattern;

public class pattern_asPredicate {
    public static void main(String[] args) {
        var words = List.of("skylack", "trail", "water","cloud" ,"curtain","falcon");

        var pred = Pattern.compile("^...{3}$").asPredicate();
        var res = words.stream().anyMatch(pred);

        if (res){
            System.out.println("there is a three latin character");
        }
        else {
            System.out.println("there is not a three latin character");
        }
    }
}
