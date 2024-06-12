import java.util.ArrayList;

public class Arraylist {
    public static void main(String[]args) {
        ArrayList<String> city = new ArrayList<String>();
        city.add("Gurdaspur");
        city.add("Dinanagar");
        city.add("Dorangla");
        city.add("Delhi");
        System.out.println(city);

        ArrayList<String> name = new ArrayList<String>();
        name.add("gorish");
        name.add("rahul");
        name.add("raman");
        System.out.println(name);

        ArrayList<String> sign = new ArrayList<String>();
        sign.add("how");
        sign.add("who");
        sign.add("get");
        sign.addLast("why");
            System.out.println(sign);

            ArrayList<String> hi = new ArrayList<String>();
            hi.add("hello");
            hi.add("micro");
            hi.add("get");
            hi.addFirst("enemy");

                System.out.println(hi);


                ArrayList<String> get =new ArrayList<String>();
                get.add("me");
                get.add("justin");
                get.add("herical");
                get.add("cheat");
                get.removeFirst();
        System.out.println(get);

        ArrayList<String> net =new ArrayList<String>();
        net.add("jio");
        net.add("airtel");
        net.add("bsnl");
        net.add("idea");
        net.add("vi");
        net.removeLast();
        System.out.println(net);


        ArrayList<String> h =new ArrayList<String>();
        h.add("hi");
        h.add("jonas");
        h.add("justin");
        h.add("margin");
        ;
        System.out.println(h.getFirst());

        ArrayList<String> m = new ArrayList<String>();
        m.add("sign");
        m.add("gmail");
        m.add("how");
        m.add("goo");
        System.out.println(m.getLast());




    }
}
