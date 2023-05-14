public class Employee extends Human 
{
    // Constructor
    public Employee (String username, String password)
    {
        super(username, password);
    }

    public static void login() 
    {
        while (true) 
        {
            System.out.println("Username: ");
            String username = ScannerUtil.takeString();
            System.out.println("Password: ");
            String password = ScannerUtil.takeString();
            if (username.equals("admin") && password.equals("password"))
                break;
            else
                System.out.println("Wrong Entry.");
        }
    }
}
