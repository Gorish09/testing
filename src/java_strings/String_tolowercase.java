package java_strings;

public class String_tolowercase {
    public static void main(String[] args) {
        String name ="Master";
        String name1 = "Python";
        String name2 = "master";
        String name3 = name.toLowerCase();
        String name4 = name1.toLowerCase();
        String name5 = name2.toLowerCase();

        int i = name3.compareTo(name4);
        if (i == 0) {
            System.out.println("these are equal");
        }
        else {
            System.out.println("these are not equal");
        }
    }
}
