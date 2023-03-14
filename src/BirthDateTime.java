import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args) {
        int month = 0;
        int day = 0;
        int year = 0;
//most variables are initialized here

        Scanner in = new Scanner(System.in);

        month = SafeInput.getRangedInt(in, "What is your birth month?", 1, 12);
        int         daysInMonth = switch (month) {
            case 1, 3, 5, 7, 8, 11 -> daysInMonth = 31;
            case 2 -> daysInMonth = 28;
            case 4, 6, 9, 10, 12 -> daysInMonth = 30;
            default -> throw new IllegalStateException("Unexpected value: " + month);
        };
//Switch allows the months to have their specified amount of days
        day = SafeInput.getRangedInt(in, "What day were you born on?", 1, daysInMonth);
        year = SafeInput.getRangedInt(in, "What is your birth year?", 1900, 2023);



        System.out.println("You said your birthday is " + month + "/" + day + "/" + year);

    }
}
