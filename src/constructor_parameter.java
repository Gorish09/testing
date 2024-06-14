import java.awt.*;

    class Rectangle {
        int length;
        int width;

        Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        Rectangle(int length) {
            this.length = length;
            this.width = 0;
        }

        public int calculateArea() {
            return length + width;
        }
    }
    public class constructor_parameter{
        public static void main(String[] args) {
            Rectangle rectangle1 = new Rectangle(10,20);
            System.out.println("Area of rectangle:" + rectangle1.calculateArea());
            Rectangle rectangle2 = new Rectangle(18);
            System.out.println("Area of rectangle2:" + rectangle2.calculateArea());
        }
    }


