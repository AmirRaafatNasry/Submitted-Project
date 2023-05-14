public class Sell extends Car
{
    // Attributes
    private static int count = 0;

    // Constructor
    public Sell(String disabled, String bodyType, String fuelType, String transmissionType, String color, int numberOfSeats) 
    {
        super(disabled, bodyType, fuelType, transmissionType, color, numberOfSeats);
        count++;
    }

    // Getters & Setters
    public static int getCount() 
    {
        return count;
    }
}