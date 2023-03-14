import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    String menu = "";

    menu = SafeInput.getRegExString(in, "What is your menu choice?", "[OoSsVvQq]");


}
}


