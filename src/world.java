public class world {
    static void myStaticMethod(){
        System.out.println("hello my name is Gorish");
    }
    static void myPublicMethod(){
        System.out.println("i am 19 years old");
    }

    public static void main(String[] args) {
        myStaticMethod();
        world myObj = new world();
        myObj.myPublicMethod();
    }
}
