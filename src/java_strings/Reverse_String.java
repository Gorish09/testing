package java_strings;

public class Reverse_String {
    public static void main(String[] args) {
//        String str = "LittleGreek", nstr=" ";
//        char ch;
//
//        System.out.println("Original word: ");
//        System.out.println("LittleGreek");
//
//        for (int i = 0; i<str.length(); i++){
//            ch = str.charAt(i);
//            nstr =  ch+nstr;
//        }
//        System.out.println("Reversed word: " + nstr);
//    }
//
        String s = "Laptop";
        String result = "";


        for (int i = s.length() - 1; i >= 0; i--)
            result += s.charAt(i);

        System.out.println(result);
    }


}