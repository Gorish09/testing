package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Custom_Arraylist {
    private int[] data;
    private static int Default_Size = 10;
    private int size = 0;

    public Custom_Arraylist(){
        this.data = new int [Default_Size];
    }

    public void add(int num){
        if (isfull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }
    public int remove() {
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void  set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "Custom_Arraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        Custom_Arraylist list = new Custom_Arraylist();
        list.add(3);
        list.add(5);
        list.add(9);

        System.out.println(list);

    }
}
