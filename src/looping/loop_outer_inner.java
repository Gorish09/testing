package looping;

public class loop_outer_inner {
    public static void main(String[]args){
        // outer loop
        for( int i=1;i<=2; i++){
            System.out.println("outer:" +i);
            // inner loop
            for(int j=6; j<18;j++){
                System.out.println("inner:" + j);
            }
        }
    }
}
