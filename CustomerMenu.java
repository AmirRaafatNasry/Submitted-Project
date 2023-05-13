public class CustomerMenu 
{
    public static void start() 
    {
        System.out.println("01. Rent");
        System.out.println("02. Buy");

        int customerChoice = ScannerUtil.takeInteger(2, 1);
        if (customerChoice == 1)
        {
            for (int i = 0; i < Rent.getCount(); i++)
            {
                System.out.println("- " + (i + 1) + " --------------------------------");
                System.out.println();
                
                System.out.println("01. Car for people with disabilities? " + Storage.rentableCar[i].isDisabled());
                System.out.println("02. Body type: " + Storage.rentableCar[i].getBodyType());
                System.out.println("03. Fuel Type: " + Storage.rentableCar[i].getFuelType());
                System.out.println("04. Transmission Type: " + Storage.rentableCar[i].getTransmissionType());
                System.out.println("05. Color: " + Storage.rentableCar[i].getColor());
                System.out.println("06. Number of Seats: " + Storage.rentableCar[i].getNumberOfSeats());

                System.out.println("----------------------------------");
                System.out.println();
            }
        }

        else
        {
            for (int i = 0; i < Buy.getCount(); i++)
            {
                System.out.println("- " + (i + 1) + " --------------------------------");
                System.out.println();
                
                System.out.println("01. Car for people with disabilities? " + Storage.buyableCar[i].isDisabled());
                System.out.println("02. Body type: " + Storage.buyableCar[i].getBodyType());
                System.out.println("03. Fuel Type: " + Storage.buyableCar[i].getFuelType());
                System.out.println("04. Transmission Type: " + Storage.buyableCar[i].getTransmissionType());
                System.out.println("05. Color: " + Storage.buyableCar[i].getColor());
                System.out.println("06. Number of Seats: " + Storage.buyableCar[i].getNumberOfSeats());

                System.out.println("----------------------------------");
                System.out.println();
            }
        }
    }
}