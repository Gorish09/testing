package constructor;

public class many_parameters {
    int Establishedyear;
    String bookName;

    public many_parameters(int year , String name){
        Establishedyear = year;
        bookName = name;
    }

    public static void main(String[] args) {
        many_parameters mybook = new many_parameters(2010,"java_course");
        System.out.println(mybook.Establishedyear + " " + mybook.bookName);
    }
}
