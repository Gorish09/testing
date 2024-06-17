package List_Sorting;
import java.util.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> rno = new ArrayList<Integer>();
        rno.add(44);
        rno.add(32);
        rno.add(41);
        rno.add(67);
        rno.add(12);
        rno.add(45);

        Collections.sort(rno);

        for (int i : rno){
            System.out.println(i);
        }
    }
}
