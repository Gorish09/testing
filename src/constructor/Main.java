package constructor;

public class Main {
    int x;
     public Main(){
         x = 33;
     }

    public static void main(String[] args) {
        Main sterio = new Main();
        System.out.println(sterio.x);
    }
}
