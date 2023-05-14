public class CustomerMenu 
{
    public static void start() 
    {
        
        System.out.println("Email: ");
        String email = ScannerUtil.takeString();
        System.out.println("Username: ");
        String username = ScannerUtil.takeString();
        System.out.println("Password: ");
        String password = ScannerUtil.takeString();
        System.out.println("Phone number: ");
        int phoneNumber = ScannerUtil.takeInteger();

        Storage.customer = new Customer(email, username, password, phoneNumber);
        System.out.println("01. Rent");
        System.out.println("02. Buy");

        int customerChoice = ScannerUtil.takeInteger(2, 1);
        if (customerChoice == 1) 
        {
            for (int i = 0; i < Rent.getCount(); i++) 
            {
                System.out.println("- " + (i + 1) + " --------------------------------");
                System.out.println();

                if (Storage.rentableCar[i].isAvailable()) 
                {
                    System.out.println("01. Car for people with disabilities? " + Storage.rentableCar[i].getDisabled());
                    System.out.println("02. Body type: " + Storage.rentableCar[i].getBodyType());
                    System.out.println("03. Fuel Type: " + Storage.rentableCar[i].getFuelType());
                    System.out.println("04. Transmission Type: " + Storage.rentableCar[i].getTransmissionType());
                    System.out.println("05. Color: " + Storage.rentableCar[i].getColor());
                    System.out.println("06. Number of Seats: " + Storage.rentableCar[i].getNumberOfSeats());
                } 
                else
                    System.out.println("Not Available");

                System.out.println();
                System.out.println("----------------------------------");
                System.out.println();
            }

            int rented = ScannerUtil.takeInteger(Rent.getCount(), 1);
            Storage.rentableCar[rented - 1].setAvailable(false);
            Storage.customer.setRentedCars(Storage.rentableCar[rented - 1]);
        }

        else if (customerChoice == 2) 
        {
            for (int i = 0; i < Sell.getCount(); i++) 
            {
                System.out.println("- " + (i + 1) + " --------------------------------");
                System.out.println();

                if (Storage.buyableCar[i].isAvailable()) 
                {
                    System.out.println("01. Car for people with disabilities? " + Storage.buyableCar[i].getDisabled());
                    System.out.println("02. Body type: " + Storage.buyableCar[i].getBodyType());
                    System.out.println("03. Fuel Type: " + Storage.buyableCar[i].getFuelType());
                    System.out.println("04. Transmission Type: " + Storage.buyableCar[i].getTransmissionType());
                    System.out.println("05. Color: " + Storage.buyableCar[i].getColor());
                    System.out.println("06. Number of Seats: " + Storage.buyableCar[i].getNumberOfSeats());
                } 
                else
                    System.out.println("Not Available");

                System.out.println();
                System.out.println("----------------------------------");
                System.out.println();

                int bought = ScannerUtil.takeInteger(Rent.getCount(), 1);
                Storage.rentableCar[bought - 1].setAvailable(false);
            }
        }
    }
}