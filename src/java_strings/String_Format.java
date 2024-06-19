package java_strings;

public class String_Format {
    public static void main(String[] args) {
        String Essay = " Hi my name is %s. i am %d years old. I am %s . I am a %s work in %s"  ;
        String result = String.format(Essay , "Gorish Mahajan" , 19 , "Good Boy" , "programmer" , "XByte solution");
        System.out.println(result);
    }
}
