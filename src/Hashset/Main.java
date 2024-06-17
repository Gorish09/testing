package Hashset;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<String>();
        name.add("Gorish");
        name.add("Rahul");
        name.add("Jonas");
        name.add("Peter");
        System.out.println(name);

          name.contains("Jonas");
          System.out.println(name.contains("Jonas"));

        name.remove("Peter");
        System.out.println(name);

//        name.clear();
//        System.out.println(name);

        name.size();
        System.out.println(name.size());

        for (String i : name){
            System.out.println(i);
        }
    }
}
