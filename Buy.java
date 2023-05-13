public class Buy extends Car
{
    // Attributes
    private static int count = 0;

    // Constructor
    public Buy(boolean disabled, String bodyType, String fuelType, String transmissionType, String color, int numberOfSeats) 
    {
        super(disabled, bodyType, fuelType, transmissionType, color, numberOfSeats);
        count++;
    }

    // Getters (Accessors) & Setters (Mutators)
    public static int getCount() 
    {
        return count;
    }

}
