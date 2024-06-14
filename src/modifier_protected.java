class cars{
    protected String fName = "Lamborghini";
    protected String lName = "urus";
    protected String engine= "FSI twin-turboV8";
    protected int released = 2017;
}
public class modifier_protected {
    private int purchase = 2020;


    public static void main(String[] args){
        modifier_protected myObj = new modifier_protected();
        System.out.println("Name:" + myObj.fName + " " + myObj.lName);
        System.out.println("Engine:" + myObj.engine);
        System.out.println("Released:" + myObj.released);
        System.out.println("purchase:" + myObj.purchase);
    }

}
