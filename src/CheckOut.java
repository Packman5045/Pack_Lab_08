import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args)
    {
        double price = 0;
        boolean cont = false;
        Scanner in = new Scanner(System.in);

        do {
            price = SafeInput.getRangedDouble(in, "What is your item price?", .50, 9.99);

            System.out.println("You item costs " + price);

            cont = SafeInput.getYNConfirmation(in, "Do you have another item? ");
        }while(cont);

        System.out.println("Your total is: " + price);
    }
}
