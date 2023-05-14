public class Employee extends Human 
{
    // Constructor
    public Employee (String username, String password)
    {
        super(username, password);
    }

    public static void login() 
    {
        String username;
        while(true)
        {
            System.out.println("Username: ");
            username = ScannerUtil.takeString();
            if (username.equals("admin"))
                break;
            else
                System.out.println("Wrong Entry.");
        }

        String password;
        while (true) 
        {
            System.out.println("Password: ");
            password = ScannerUtil.takeString();
            if(password.equals("password"))
                break;
            else
                System.out.println("Wrong Entry.");
        }
    }
}
