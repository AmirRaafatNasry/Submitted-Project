public class Employee extends Human 
{
    private final String username = "admin";
    private final String password = "password";

    public static void login() 
    {
        while (true) 
        {
            String username = ScannerUtil.takeString();
            String password = ScannerUtil.takeString();
            if (username.equals("admin") && password.equals("password"))
                break;
            else
                System.out.println("Wrong Entry.");
        }
    }
}
