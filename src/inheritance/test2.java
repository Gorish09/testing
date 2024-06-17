package inheritance;


class pet{
    void eat(){
        System.out.println("eating....");
    }
}
class tiger extends Animal{
    void bark(){
        System.out.println("barking....");
    }
}
class Babytiger extends Dog{
    void weep(){
        System.out.println("weeping....");
    }
}
class TestInheritance2{
    public static void main(String[] args){
        Babytiger d=new Babytiger();
        d.weep();
        d.bark();
        d.eat();
    }
}
