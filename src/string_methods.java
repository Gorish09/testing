public class string_methods {
    public static void main(String[] args) {
        String name = "    gorish   ";

        int value = name.length();
        System.out.println(value);

        String a = name.toLowerCase();
        System.out.println(a);

        String a1 = name.toUpperCase();
        System.out.println(a1 );

        String a2 = name.trim();
        System.out.println(a2 );

        String a4 ="king";
        System.out.println(a4.substring(2));

        String a5 ="gorish";
        System.out.println(a5.substring(2 ,5));

        System.out.println("hello world");

        String a6 ="gorish";
        System.out.println(a6.replace('o' ,'i'));

        String as ="gorisho";
        System.out.println(as.startsWith("gor"));

        System.out.println(as.startsWith("gii"));

        System.out.println(as.endsWith("ish"));

        System.out.println(as.endsWith("rsd"));

        System.out.println(as.charAt(5));

        System.out.println(as.indexOf("h"));

        System.out.println(as.indexOf("h",1));

        System.out.println(as.lastIndexOf("o"));

        System.out.println(as.lastIndexOf("o", 4));

        System.out.println(as.equals("gorisho"));

        System.out.println(as.equals("gori"));

        System.out.println(as.equalsIgnoreCase("GORISHO"));

        System.out.println(as.equalsIgnoreCase("gori"));

        System.out.println("my name is gorish\" king");
    }
}

