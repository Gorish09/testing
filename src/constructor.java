public class constructor {
    int x;
    public constructor() {
        x=5;
    }

    public static void main(String[] args) {
        constructor myobj = new constructor();
        System.out.println(myobj.x);
    }
}
