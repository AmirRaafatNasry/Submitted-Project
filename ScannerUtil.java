import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerUtil 
{
    public static Scanner input = new Scanner(System.in);

    // String
    public static String takeString(String message) 
    {
        System.out.println(message);
        String text = input.next();
        return text;
    }

    // Integer
    public static int takeInteger(String message)
    {
        while (true) 
        {
            try
            {
                System.out.println(message);
                int number = input.nextInt();
                return number;
            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Expected Number.");
                input.next(); // clears buffer
            }
        }
    }

    // Options
    public static int takeInteger(int maximum, int minimum)
    {
        while (true)
        {
            try 
            {
                int number = input.nextInt();
                // out of range
                if (number > maximum || number < minimum)
                    System.out.println("Wrong Entry.");
                else
                    return number;
            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Expected Number.");
                input.next(); // clears buffer
            }
        }
    }
}