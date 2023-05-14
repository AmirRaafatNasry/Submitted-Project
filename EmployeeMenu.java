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

        System.out.println("Rentable: [50 / " + Rent.getCount() + "]");
        System.out.println("Sellable: [50 / " + Sell.getCount() + "]");
        System.out.println("Number of cars you would like to add? ");
        int SIZE = ScannerUtil.takeInteger();

        checkStorage(SIZE, employeeChoice);
    }

    public static void checkStorage(int SIZE, int employeeChoice)
    {
        if (Rent.getCount() > 50)
            System.out.println("Reached the limit!");
        else if (Sell.getCount() > 50)
            System.out.println("Reached the limit!");
        else 
        {
            System.out.println("Add Car/s Specifications");
            System.out.println();
            EmployeeMenu.addCar(SIZE, employeeChoice);
        }
    EmployeeMenu.displayCounters();
    }

    public static void addCar(int SIZE, int employeeChoice) 
    {
        String disabled[] = new String[SIZE];
        String bodyType[] = new String[SIZE];
        String fuelType[] = new String[SIZE];
        String transmissionType[] = new String[SIZE];
        String color[] = new String[SIZE];
        int numberOfSeats[] = new int[SIZE];

        for (int i = 0; i < SIZE; i++) 
        {
            while (true) 
            {
                System.out.println();
                System.out.println("-" + (i + 1) + "--------------------------------");
                System.out.println();

                System.out.println("01. Car for people with disabilities? [Y/N]");
                disabled[i] = ScannerUtil.takeString();
                System.out.println("02. Body type:");
                bodyType[i] = ScannerUtil.takeString();
                System.out.println("03. Fuel Type:");
                fuelType[i] = ScannerUtil.takeString();
                System.out.println("04. Transmission Type:");
                transmissionType[i] = ScannerUtil.takeString();
                System.out.println("05. Color:");
                color[i] = ScannerUtil.takeString();
                System.out.println("06. Number of Seats :");
                numberOfSeats[i] = ScannerUtil.takeInteger(8, 2);

                System.out.println();
                System.out.println("------------------------------");
                System.out.println();

                System.out.println("Are you sure about the data you entered? [Y/N]");
                String condition = ScannerUtil.takeString();
                if (condition.toLowerCase().equals("y"))
                    break;
                System.out.println();
            }

            if (employeeChoice == 1)
                Storage.rentableCar[i] = new Rent(disabled[i], bodyType[i], fuelType[i], transmissionType[i], color[i], numberOfSeats[i]);
            else if (employeeChoice == 2)
                Storage.buyableCar[i] = new Sell(disabled[i], bodyType[i], fuelType[i], transmissionType[i], color[i], numberOfSeats[i]);
        }
        
    }

    public static void displayCounters()
    {
        System.out.println();
        System.out.println("Total: " + (100 - (Sell.getCount() + Rent.getCount())));
        System.out.println("Rentable: " + Rent.getCount());
        System.out.println("Buyable: " + Sell.getCount());
        System.out.println();
    }

}