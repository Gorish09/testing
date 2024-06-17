package Linked_list;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
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

