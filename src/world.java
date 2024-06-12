public class world {
    static void myStaticMethod(){
        System.out.println("hello my name isadsfasd Vivek ");
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
