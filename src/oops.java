public class  oops {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        String[] names = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];
        //Student gorish;
        Student gorish = new Student();
        gorish.marks = 92;

//        gorish.changename("car lover");
        gorish.greeting();
        System.out.println(gorish.rno);
        System.out.println(gorish.name);
        System.out.println(gorish.marks);

        Student random = new Student(gorish);
        System.out.println(random.name);

        Student random2 =new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name ="something Something";

        System.out.println(two.name);



      }
    }
            class Student {
            int rno;
            String name;
            float marks;

            void greeting(){
                System.out.println("Hello my name is "+ this.name);
            }
            void changeName(String Name){
                name = Name;
            }

            Student (Student other){
                this.name =other.name;
                this.rno =other.rno;
                this.marks = other.marks;
            }
                 Student(){
                  this.rno=2;
                  this.name="Gorish Mahajamn";
                  this.marks =90.2f;

            }

            //Student rahul = new Student(18,"rahul", 87.9);
            // here, this will be replaced with arpit
            Student(int rno,String name, float marks){
                rno =rno;
                name = name ;
                marks = marks;
            }

        }




