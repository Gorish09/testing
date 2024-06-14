package looping;

public class java_continue {
    public static void main(String[]args){
        int i = 4;
        while(i<19){
            if (i==3){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
