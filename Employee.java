public class Employee extends Human {
    // Constructor
    public Employee(String username, String password) {
        super(username, password);
    }

    public static void login() {
        String username;
        while (true) {
            username = ScannerUtil.takeString("Username: ");
            if (username.equals(Storage.admin.getPassword()))
                break;
            else
                System.out.println("Wrong Entry.");
        }
        String password;
        while (true) {
            password = ScannerUtil.takeString("Password: ");
            if (password.equals(Storage.admin.getPassword()))
                break;
            else
                System.out.println("Wrong Entry.");
        }
    }
}
