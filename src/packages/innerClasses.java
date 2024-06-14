package packages;


import java.util.Arrays;

class test {
    String name;

    public test(String name){
        this.name = name;
    }
}
public class innerClasses {

    public static void main (String[]args){
        test a = new test("gorish");
        test b = new test("rahul ");
        Arrays.toString(new int[]{3,4,5,});

        System.out.println(a.name);
        System.out.println(b.name);



    }
}
