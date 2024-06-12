import java.util.ArrayList;
import java.util.LinkedList;

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

        LinkedList<String> t =new LinkedList<String>();
        t.add("good");
        t.add("string");
        t.add("call");
        t.add("hexaclone");
        System.out.println(t);

        LinkedList<String> j =new LinkedList<String>();
        j.add("joker");
        j.add("jake");
        j.add("just");
        j.add("justice");
        j.addFirst("justin");
        System.out.println(j);

        LinkedList<String> n =new LinkedList<String>();
        n.add("jio");
        n.add("airtel");
        n.add("bsnl");
        n.add("idea");
        n.add("vi");
        n.removeLast();
        System.out.println(n);

        LinkedList<String> can =new LinkedList<String>();
        can.add("soul");
        can.add("could");
        can.add("calvin");
        can.add("bugati");
        can.addLast("soul");
        System.out.println(can);

        LinkedList<String> kelvin= new LinkedList<String>();
        kelvin.add("jonas");
        kelvin.add("kingfisher");
        kelvin.add("soul");
        kelvin.add("held");
        kelvin.removeFirst();
        System.out.println(kelvin);

        LinkedList<String> l1 =new LinkedList<String>();
        l1.add("soul");
        l1.add("could");
        l1.add("calvin");
        l1.add("bugati");
        l1.addLast("soul");
        System.out.println(l1.getFirst());

        LinkedList<String> t1 =new LinkedList<String>();
        t1.add("good");
        t1.add("string");
        t1.add("call");
        t1.add("hexaclone");
        System.out.println(t.getLast());











    }
}
