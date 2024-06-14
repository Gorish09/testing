package Array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        String[] city = {"gurdaspur","pathankot","delhi"};
        String[]  city2 ={"gurdaspur","pathankot","delhi"};
        System.out.println(Arrays.compare(city,city2));

        String[] city1 = {"gurdaspur","pathankot","delhi"};
        String[]  city3 = {"gurdaspur","pathankot","delhi"};
        System.out.println(Arrays.equals(city1,city3));

        String[] hut = {"table","chair","ford","genius","jinga"};
        Arrays.sort(hut);
        for(String i : hut ){
            System.out.println(i);


        }
    }


}
