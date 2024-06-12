public class Main {
    int x=38;

    public static void main(String[] args) {
        Main myobj1 =new Main();
        Main myobj2=new Main();
        myobj2.x=23;
        System.out.println(myobj1.x);
        System.out.println(myobj2.x);
    }
}
