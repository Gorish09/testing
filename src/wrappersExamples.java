public class wrappersExamples {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//
//        Integer num = 45;
        Integer a = 10;
        Integer b = 20;
        swap(a, b);

        System.out.println(a +"  " + b);

//        final int bonus = 2;
//        bonus = 3;

        final A gorish = new A("Gorish Mahajan");
        gorish.name = "other name";

    }
     static void swap(Integer a ,Integer b){
        int temp = a;
        a = b;
        b = temp;
    }

}
 class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }
 }