public class Rent extends Car
{
    private static int count = 0;

    // constructor
    public Rent(boolean disabled, String bodyType, String fuelType, String transmissionType, String color, int numberOfSeats) 
    {
        super(disabled, bodyType, fuelType, transmissionType, color, numberOfSeats);
        count++;
    }
    
    public static int getCount() 
    {
        return count;
    }
}
