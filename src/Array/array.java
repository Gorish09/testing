package Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] city = {"Gurdaspur","Pathankot","Delhi"};
        String[]  city2 ={"Gurdaspur","Pathankot","Delhi"};
        System.out.println(Arrays.compare(city,city2));

        String[] city1 = {"Gurdaspur","Pathankot","Delhi"};
        String[]  city3 = {"gurdaspur","Pathankot","Delhi"};
        System.out.println(Arrays.equals(city1,city3));

        String[] hut = {"table","Chair","Ford","Genius","Hexa"};
        Arrays.sort(hut);
        for(String i : hut ){
            System.out.println(i);


        }
    }


}
