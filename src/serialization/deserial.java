package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class deserial {
    public static void main(String[] args) {
        try{
            FileInputStream file = new FileInputStream("ob.txt");

            ObjectInputStream ois = new ObjectInputStream(file);

            Student1 student = (Student1) ois.readObject();
            student.displayname();
            System.out.println(student.getName());
            System.out.println(student.getEmail());
            System.out.println(student.getEmail());
            System.out.println(student.getAdress());

        }
        catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        catch(IOException ex){
            ex.printStackTrace();

        }
    }


    private static class Student {
    }
}
