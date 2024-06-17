package constructor;

public class parameter {
    int x;
    public parameter(int y){
        x = y;
    }

    public static void main(String[] args) {
        parameter myObj = new parameter(27);
        System.out.println(myObj.x);
    }
}
