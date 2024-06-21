package serialization;

import java.io.*;



class Em implements Serializable {
     private static final long serialversionUID = 123445677L;
     transient int a;
     static int b;
     String name;
     int age;

     public Em(String name, int age, int a, int b) {

         this.name = name;
         this.age = age;
         this.a = a;
         this.b = b;
     }
 }
 public class implement_serialziable{
    public static void printdate(Em object1){

        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + object1.b);
    }

     public static void main(Em args) throws IOException {
         Em object = new Em("ab", 20, 2, 2000);
         String filename = "shubham.txt";
         try {
             FileOutputStream file = new FileOutputStream(filename);
             ObjectOutputStream out = new ObjectOutputStream(file);

             out.writeObject(object);

             out.close();
             file.close();

             System.out.println("Object has been serialized\\n\"\n" +
                     "                              + \"Data before Deserialization");

             printdata(object);
             object.b = 2000;
         }

         catch (IOException ex){
             System.out.println("IOException is caught");
         }
         object = null;

         try{
             FileInputStream file = new FileInputStream(filename);
             ObjectInputStream in = new ObjectInputStream
                     (file);


             object = (Em)in.readObject();

             in.close();
             file.close();
             System.out.println("Object has been deserialized\n"
                     + "Data after Deserialization.");
             printdata(object);

         }
         catch (IOException ex) {
             System.out.println("IOException is caught");
         }

         catch (ClassNotFoundException ex) {
             System.out.println("ClassNotFoundException" +
                     " is caught");
         }

     }

     private static void printdata(Em object) {
     }


 }