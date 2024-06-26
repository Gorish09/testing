package inheritance;

class wildAnimal{
    void eat(){
        System.out.println("eating...");
    }
}
class Tiger extends Main{
    void run(){
        System.out.println("barking...");
    }
}
class loin extends Main{
    void bark(){
        System.out.println("meowing...");
    }
}
class TestInheritance3{
    public static void main(String[] args){
        loin c=new loin();
        c.bark();
        c.eat();

    }
}