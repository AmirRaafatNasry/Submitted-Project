public class MainMenu 
{
    public static void start() 
    {
        printTermsAndConditions();
        printInstructions();
        chooseUser();
    }

    public static void printTermsAndConditions() 
    {
        System.out.println("--------------------------------------------------");
        System.out.println("\"Quality is Job One.\"");
        System.out.println("- Canadian International College (CIC) Car Agency");
        System.out.println("--------------------------------------------------");
        System.out.println("Terms & Condition");

        System.out.println("01. ");
        System.out.println("    A) ");
        System.out.println("    B) ");
        System.out.println("    C) ");
        System.out.println();

        System.out.println("02. ");
        System.out.println();

        System.out.println("03. ");
        System.out.println("    A) ");
        System.out.println("    B) ");
        System.out.println();

        System.out.println("04. ");
        System.out.println();

        System.out.println("05 ");
        System.out.println("    A) ");
        System.out.println("    B) ");
        System.out.println("    C) ");
        System.out.println("    D) ");
        System.out.println("---------------------------------------------------");

        while (true) 
        {
            String condition = ScannerUtil.takeString("Do you agree to our Terms & Conditions? [Y/N]");
            if (condition.toLowerCase().equals("y"))
                break;
        }
    }

    public static void printInstructions() 
    {
        System.out.println("---------------------------------------------------");
        System.out.println("01. ");
        System.out.println("02. ");
        System.out.println("03. ");
        System.out.println("04. ");
        System.out.println("---------------------------------------------------");

        while (true) 
        {
            String condition = ScannerUtil.takeString("Proceed? [Y/N]");
            if (condition.toLowerCase().equals("y"))
                break;
        }
    }

    public static void chooseUser() 
    {
        while (true) 
        {
            // Options
            System.out.println("01. Customer");
            System.out.println("02. Employee");
            System.out.println("00. Exit");

            // Choose
            switch (ScannerUtil.takeInteger(2, 0)) 
            {
                case (1):
                    CustomerMenu.start();
                    break;
                case (2):
                    Employee.login();
                    EmployeeMenu.start();
                    break;
                case (0):
                    System.exit(0);
            }
        }
    }

}
