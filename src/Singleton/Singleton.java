package Singleton;

public class Singleton {
    private int num = 0;
    Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null){
            instance = new Singleton();

        }
        return instance;
    }
}
