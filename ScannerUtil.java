import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerUtil 
{
    public static Scanner input = new Scanner(System.in);

    // String
    public static String takeString() 
    {
        // while (true) 
        // {
        //     try 
        //     {
                String text = input.next();
                return text;
        //     }
        //     catch (InputMismatchException exception) 
        //     {
        //         System.out.println("Expected Text.");
        //         input.next();
        //     }
        // }
    }

    // Integer
    public static int takeInteger() 
    {
        while (true) 
        {
            try 
            {
                int number = input.nextInt();
                return number;
            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Expected Number.");
                input.next();
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

                if (number > maximum || number < minimum)
                    System.out.println("Wrong Entry.");
                else
                    return number;

            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Expected Number.");
                input.next();
            }
        }
    }
}
