package polymorphish;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle circle = new circle();
        square square  = new square();


        shape.area();
        circle.area();
        square.area();

    }
}
