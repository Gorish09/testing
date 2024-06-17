package List_Sorting;
import java.util.Collections;
import java.util.ArrayList;

public class reverse_order_numbers {
    public static void main(String[] args) {
        ArrayList<Integer> myno = new ArrayList<Integer>();
        myno.add(4);
        myno.add(45);
        myno.add(45);
        myno.add(-34);
        myno.add(88);

        Collections.sort(myno, Collections.reverseOrder());

        for (int i : myno) {
            System.out.println(i);
        }
    }
}
