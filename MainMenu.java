public class MainMenu 
{

    public static void start()
    {
        printRules();
        printInstructions();

        while (true)
        {
            displayOptions();
            switch(ScannerUtil.takeInteger(2, 1))
            {
                case (1):
                    CustomerMenu.start();
                    break;
                case (2):
                    Employee.login();
                    EmployeeMenu.start();
                    break;
            }
        }
    }

    public static void displayOptions()
    {
        System.out.println("01. Customer");
        System.out.println("02. Employee");
    }

    public static void printRules() 
    {
        while (true)
        {
            System.out.println("---------------------------------------------------");
            System.out.println("\"Quality is Job One\"");
            System.out.println("- Canadian International College (CIC) Car Agency.");
            System.out.println("---------------------------------------------------");
            System.out.println("Terms & Condition");

            System.out.println("01. ");
            System.out.println("    A) ");
            System.out.println("    B) ");
            System.out.println("    C) ");
            
            System.out.println("02. ");

            System.out.println("03. ");
            System.out.println("    A) ");
            System.out.println("    B) ");

            System.out.println("04. ");

            System.out.println("05 ");
            System.out.println("    A) ");
            System.out.println("    B) ");
            System.out.println("    C) ");
            System.out.println("    D) ");
            System.out.println("---------------------------------------------------");
    
            System.out.println("Do you agree to our Terms & Conditions? [true/false]");
            boolean flag = ScannerUtil.takeBoolean();
            if (flag)
                break;
        }
    }

    public static void printInstructions() 
    {
        while (true)
        {
            System.out.println("---------------------------------------------------");
            System.out.println("01. ");
            System.out.println("02. ");
            System.out.println("03. ");
            System.out.println("04. ");
            System.out.println("---------------------------------------------------");

            System.out.println("Proceed? [true/false]");
            boolean flag = ScannerUtil.takeBoolean();
            if (flag)
                break;
        }
    }
}