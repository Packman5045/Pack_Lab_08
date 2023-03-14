import java.util.Scanner;
public class FavNumbers
{
    public static void main(String[] args)
    {
        int favInt = 0;
        double favDub = 0;
        Scanner in = new Scanner(System.in);

        favInt = SafeInput.getInt(in, "What is your fav Integer?");

        System.out.println("You said your name " + favInt);



        favDub = SafeInput.getDouble(in, "What is your fav 'double' style number?");

        System.out.println("You said your name " + favDub);
    }
}

