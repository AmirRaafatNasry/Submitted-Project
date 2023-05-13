import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerUtil 
{
    public static Scanner input = new Scanner(System.in);

    // check 123
    public static String takeString() 
    {
        while (true) 
        {
            try 
            {
                String text = input.next();
                return text;
            }
            catch (InputMismatchException exception) 
            {
                System.out.println("Expected");
                input.next();
            }
        }
    }

    public static boolean takeBoolean() 
    {
        while (true) 
        {
            try 
            {
                boolean flag = input.nextBoolean();
                return flag;
            } 
            catch (InputMismatchException exception) 
            {
                System.out.println("Expected [true/false]");
                input.next();
            }
        }
    }

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
                System.out.println("Expected a number");
                input.next();
            }
        }
    }

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
                System.out.println("Expected a number");
                input.next();
            }
        }
    }
}
