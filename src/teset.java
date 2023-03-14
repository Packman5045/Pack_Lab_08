import java.util.Scanner;
public class teset {


    public static void main(String[] args) {
        int n = 60;
        for (int i = 60; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();


        }

        for (int i = 60; i <= n; i++) {
            for (int j = 1; j <= n; j++)
            {
                if(j==1 || j == 58 || j==2 || j == 59 || j==3 || j == 60)
                System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();


        }
        for (int i = 60; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

