package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serial {
    public static void main(String[] args) throws IOException {
       try{
           Student1 student = new Student1("Gorish Mahajan","gorish@gmail.com", 19,"Gurdaspur");

           FileOutputStream fos = new FileOutputStream("ob.txt");

           ObjectOutputStream oos = new ObjectOutputStream(fos);

           oos.writeObject(student);

           oos.close();
           fos.close();

           System.out.println("object ststed is transfered to file ob");

       }
       catch(IOException ex){
           ex.printStackTrace();
       }

        }
    }


