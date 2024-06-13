public class oops {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        //Student gorish;
        Student gorish = new Student();
        gorish.marks = 92;
        System.out.println(gorish.rno);
        System.out.println(gorish.name);
        System.out.println(gorish.marks);
      }
    }
            class Student {
            int rno;
            String name;
            float marks;
        }




