package serialization;

import java.io.Serializable;

public class Student1 implements Serializable {
    private String name;
    private  String email;
    private int age;
    private String adress;

    public Student1(String name, String email, int age, String adress) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.adress = adress;
    }

    public Student1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void displayname(){
        System.out.println("Hi my name is"+ this.name);
    }
}

