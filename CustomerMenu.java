public class CustomerMenu 
{
    public static void start() 
    {
        System.out.println("01. Rent");
        System.out.println("02. Buy");
        int customerChoice = ScannerUtil.takeInteger(2, 1);

        if (customerChoice == 1) {
            if (Storage.rentableCarCount == 0)
                System.out.println("There is no cars for rent");
            else
                displayRentableCarsData();
        }
        if (customerChoice == 2) {
            if (Storage.sellableCarCount == 0)
                System.out.println("There is no cars for selling");
            else
                displayBuyableCarsData();
        }
    }

    public static void displayRentableCarsData() 
    {
        if (checkForAvailableRentableCar()) 
        {
            for (int i = 0; i < Storage.rentableCarCount; i++) 
            {
                if (Storage.rentableCar[i].isAvailable()) 
                {
                    System.out.println();
                    System.out.println("-" + (i + 1) + "--------------------------------");

                    System.out.println("01. Car Accessibility? " + Storage.rentableCar[i].getAccessibility());
                    System.out.println("02. Body Type: " + Storage.rentableCar[i].getBodyType());
                    System.out.println("03. Fuel Type: " + Storage.rentableCar[i].getFuelType());
                    System.out.println("04. Transmission Type: " + Storage.rentableCar[i].getTransmissionType());
                    System.out.println("05. Color: " + Storage.rentableCar[i].getColor());
                    System.out.println("06. Number of Seats: " + Storage.rentableCar[i].getNumberOfSeats());
                } 
                else 
                    System.out.println("Rented");

                System.out.println("----------------------------------");
                System.out.println();
            }

            // Takes Customer Choice
            System.out.println("Choose Number");
            int rented = ScannerUtil.takeInteger(Storage.rentableCarCount, 1);
            int index = (rented - 1);
            // register
            register();
            // unavailable
            Storage.rentableCar[index].setAvailable(false);
            Storage.customer.setRentedCars(Storage.rentableCar[index]);
        } 
        else
            System.out.println("NO CARS!");
    }

    public static boolean checkForAvailableRentableCar() 
    {
        for (int i = 0; i < Storage.rentableCarCount; i++)
            if (Storage.rentableCar[i].isAvailable())
                return true;
        return false;
    }

    public static void displayBuyableCarsData() 
    {
        if (checkForAvailableSellableCar())
        {
            for (int i = 0; i < Storage.sellableCarCount; i++) 
            {
                System.out.println();
                System.out.println("-" + (i + 1) + "--------------------------------");

                if (Storage.sellableCar[i].isAvailable()) {
                    System.out.println("01. Car Accessibility? " + Storage.sellableCar[i].getAccessibility());
                    System.out.println("02. Body Type: " + Storage.sellableCar[i].getBodyType());
                    System.out.println("03. Fuel Type: " + Storage.sellableCar[i].getFuelType());
                    System.out.println("04. Transmission Type: " + Storage.sellableCar[i].getTransmissionType());
                    System.out.println("05. Color: " + Storage.sellableCar[i].getColor());
                    System.out.println("06. Number of Seats: " + Storage.sellableCar[i].getNumberOfSeats());
                } 
                else
                    System.out.println("Sold");

                System.out.println("----------------------------------");
                System.out.println();
            }

            // Takes Customer Choice
            System.out.println("Choose Number");
            int bought = ScannerUtil.takeInteger(Storage.sellableCarCount, 1);
            int index = (bought - 1);
            // register
            register();
            // unavailable
            Storage.sellableCar[index].setAvailable(false);
            Storage.customer.setBoughtCars(Storage.sellableCar[index]);
        }
        else
            System.out.println("NO CARS!");
    }

    public static boolean checkForAvailableSellableCar() 
    {
        for (int i = 0; i < Storage.sellableCarCount; i++)
            if (Storage.sellableCar[i].isAvailable())
                return true;
        return false;
    }

    public static void register() 
    {
        String email = ScannerUtil.takeString("Email: ");
        String username = ScannerUtil.takeString("Username: ");
        String password = ScannerUtil.takeString("Password: ");
        String phoneNumber = ScannerUtil.takeString("Phone number: ");
        Storage.customer = new Customer(email, username, password, phoneNumber);
    }
}