package packages;

public class static1 {
    static int a = 4;
    static int b;

    static {
        System.out.println("My name is gorish");
        b = a * 5;
    }

    public static void main(String[] args) {
        static1 obj= new static1();
        System.out.println(static1.a + "  " + static1.b);

        static1.b += 3;

        static1 obj2 = new static1();
        System.out.println(static1.a + " " + static1.b);
    }
}
