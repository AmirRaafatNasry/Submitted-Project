public class CustomerMenu {
    public static void start() {
        System.out.println("01. Rent");
        System.out.println("02. Buy");
        int customerChoice = ScannerUtil.takeInteger(2, 1);

        if (customerChoice == 1)
            displayRentableCarsData();
        else if (customerChoice == 2)
            displayBuyableCarsData();
    }

    public static void displayRentableCarsData() {
        for (int i = 0; i < Storage.rentableCarCount; i++) {
            System.out.println();
            System.out.println("- " + (i + 1) + " --------------------------------");

            if (Storage.rentableCar[i].isAvailable()) {
                System.out.println("01. Car Accessibility? " + Storage.rentableCar[i].getAccessibility());
                System.out.println("02. Body Type: " + Storage.rentableCar[i].getBodyType());
                System.out.println("03. Fuel Type: " + Storage.rentableCar[i].getFuelType());
                System.out.println("04. Transmission Type: " + Storage.rentableCar[i].getTransmissionType());
                System.out.println("05. Color: " + Storage.rentableCar[i].getColor());
                System.out.println("06. Number of Seats: " + Storage.rentableCar[i].getNumberOfSeats());
            } else
                System.out.println("Not Available");

            System.out.println("----------------------------------");
            System.out.println();
        }

        register();
        // Takes Customer Choice
        int rented = ScannerUtil.takeInteger(Storage.rentableCarCount, 1);
        int index = (rented - 1);
        // Sets the car as unavailable
        Storage.rentableCar[index].setAvailable(false);
        Storage.customer.setRentedCars(Storage.rentableCar[index]);
    }

    public static void displayBuyableCarsData() {
        for (int i = 0; i < Storage.sellableCarCount; i++) {
            System.out.println();
            System.out.println("- " + (i + 1) + " --------------------------------");

            if (Storage.sellableCar[i].isAvailable()) {
                System.out.println("01. Car Accessibility? " + Storage.sellableCar[i].getAccessibility());
                System.out.println("02. Body Type: " + Storage.sellableCar[i].getBodyType());
                System.out.println("03. Fuel Type: " + Storage.sellableCar[i].getFuelType());
                System.out.println("04. Transmission Type: " + Storage.sellableCar[i].getTransmissionType());
                System.out.println("05. Color: " + Storage.sellableCar[i].getColor());
                System.out.println("06. Number of Seats: " + Storage.sellableCar[i].getNumberOfSeats());
            } else
                System.out.println("Not Available");

            System.out.println("----------------------------------");
            System.out.println();
        }

        register();
        // Takes Customer Choice
        int bought = ScannerUtil.takeInteger(Storage.sellableCarCount, 1);
        int index = (bought - 1);
        // Sets the car as unavailable 
        Storage.sellableCar[index].setAvailable(false);
        Storage.customer.setBoughtCars(Storage.sellableCar[index]);
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