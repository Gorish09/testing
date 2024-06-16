package inheritance;


public class box{
    double h;
    double l;
    double w;


    box() {
       this.l = -3;
       this.h = -4;
       this.w = -4;

}

box (double side) {
    this.l = side;
    this.h = side;
    this.w = side;
}

public box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
}

box(box old) {
    this.h = old.h;
    this.l = old.l;
    this.w = old.w;
}

public void information(){
    System.out.println("Running the box");
}
}

