package Pattern_Alphabets;public class Pattern_of_A {
    public static void main(String[] args)
    {
        int i, j, n=8;

        for (i = 0; i<=n; i++)
        {

            for (j = 0; j<= n / 1; j++)
            {

                if ((j == 0 || j == n / 1) && i != 0 ||

                        i == 0  && j != n / 1 ||

                        i == n / 2)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
