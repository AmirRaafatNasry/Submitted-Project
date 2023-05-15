public class EmployeeMenu 
{
    public static void start() 
    {
        displayOptions();
    }

    public static void displayOptions() 
    {
        System.out.println("01. Add Rentable Car.");
        System.out.println("02. Add Sellable Car.");
        int employeeChoice = ScannerUtil.takeInteger(2, 1);

        displayCounters();
        int SIZE = ScannerUtil.takeInteger("Number of cars you would like to add?");

        checkStorage(SIZE, employeeChoice);
    }

    public static void checkStorage(int SIZE, int employeeChoice) 
    {
        if (Storage.rentableCarCount > Storage.max)
            System.out.println("Reached the limit for rentable cars!");
        else if (Storage.sellableCarCount > Storage.max)
            System.out.println("Reached the limit for sellable car!");
        else 
        {
            System.out.println("Add Car/s Specifications");
            System.out.println();
            EmployeeMenu.addCar(SIZE, employeeChoice);
        }
    }

    public static void addCar(int SIZE, int employeeChoice) 
    {
        String accessibility;
        String bodyType;
        String fuelType;
        String transmissionType;
        String color;
        int numberOfSeats;

        for (int i = 0; i < SIZE; i++) 
        {
            while (true) 
            {
                System.out.println();
                System.out.println("-" + (i + 1) + "--------------------------------");

                accessibility = ScannerUtil.takeString("01. Car Accessibility?"); // for people with disabilities
                bodyType = ScannerUtil.takeString("02. Body Type:");
                fuelType = ScannerUtil.takeString("03. Fuel Type:");
                transmissionType = ScannerUtil.takeString("04. Transmission Type:");
                color = ScannerUtil.takeString("05. Color:");
                numberOfSeats = ScannerUtil.takeInteger("06. Number of Seats :");

                System.out.println("------------------------------");

                System.out.println();
                String condition = ScannerUtil.takeString("Are you sure about the data you entered? [Y/N]");
                if (condition.toLowerCase().equals("y"))
                    break;
            }

            if (employeeChoice == 1)
                Storage.rentableCar[i] = new RentableCar(accessibility, bodyType, fuelType, transmissionType, color,
                        numberOfSeats);
            else
                Storage.sellableCar[i] = new SellableCar(accessibility, bodyType, fuelType, transmissionType, color,
                        numberOfSeats);
        }
    }

    public static void displayCounters() 
    {
        System.out.println("Total: " + (100 - (Storage.sellableCarCount + Storage.rentableCarCount)));
        System.out.println("Rentable: [" + Storage.max + " / " + Storage.rentableCarCount + "]");
        System.out.println("Sellable: [" + Storage.max + " / " + Storage.sellableCarCount + "]");
    }

}