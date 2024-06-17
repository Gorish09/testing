package Hashmap;

import java.util.HashMap;

public class String_integer_usage {
    public static void main(String[] args) {
        HashMap<String , Integer> People = new HashMap< String , Integer>();
        People.put ("Gorish" , 19);
        People.put("Rahul" , 2);
        People.put("Arjun" , 20);
          System.out.println(People.keySet());

          System.out.println(People.values());

         People.remove("Rahul" ,2);
         System.out.println(People);

        People.get("Gorish");
        System.out.println(People.get("Gorish"));

        People.size();
        System.out.println(People.size());

        People.clear();
        System.out.println(People);

    }
}
