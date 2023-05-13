public class EmployeeMenu 
{
    public static void start() 
    {
        displayEmployeeOptions();
    }

    public static void displayEmployeeOptions() 
    {
        System.out.println("01. Add Car Rental.");
        System.out.println("02. Add Car Selling.");
        int employeeChoice = ScannerUtil.takeInteger(2, 1);
        System.out.println("Number of Cars:");
        int SIZE = ScannerUtil.takeInteger();

        displayCarOptions(SIZE, employeeChoice);
    
    }

    public static void displayCarOptions(int SIZE, int employeeChoice) 
    {
        boolean disabled[] = new boolean[SIZE];
        String bodyType[] = new String[SIZE];
        String fuelType[] = new String[SIZE];
        String transmissionType[] = new String[SIZE];
        String color[] = new String[SIZE];
        int numberOfSeats[] = new int[SIZE];

        System.out.println("Add Car/s Specifications");
        System.out.println();

        for (int i = 0; i < SIZE; i++) 
        {
            while (true) 
            {
                System.out.println("-" + (i + 1) + "--------------------------------");
                System.out.println();

                System.out.println("01. Car for people with disabilities? [true/false]");
                disabled[i] = ScannerUtil.takeBoolean();
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

                System.out.println("Are you sure about the data you entered? [true/false]");
                boolean flag = ScannerUtil.takeBoolean();
                if (flag)
                    break;
            }

            if (employeeChoice == 1)
                Storage.rentableCar[i] = new Rent(disabled[i], bodyType[i], fuelType[i], transmissionType[i], color[i], numberOfSeats[i]);
            else if (employeeChoice == 2)
                Storage.buyableCar[i] = new Buy(disabled[i], bodyType[i], fuelType[i], transmissionType[i], color[i], numberOfSeats[i]);
        }
    }
}