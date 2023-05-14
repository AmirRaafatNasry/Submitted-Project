public class Car 
{
    // Attributes
    private String disabled;
    private String bodyType;
    private String fuelType;
    private String transmissionType;
    private String color;
    private int numberOfSeats;
    private boolean available = true;

    // Constructor
    public Car(String disabled, String bodyType, String fuelType, String transmissionType, String color, int numberOfSeats) 
    {
        this.disabled = disabled;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.color = color;
        this.numberOfSeats = numberOfSeats;
    }

    // Getters (Accessors) & Setters (Mutators)
    public String getDisabled() 
    {
        return disabled;
    }
    public void setDisabled(String disabled) 
    {
        this.disabled = disabled;
    }

    public String getBodyType() 
    {
        return bodyType;
    }
    public void setBodyType(String bodyType) 
    {
        this.bodyType = bodyType;
    }

    public String getFuelType() 
    {
        return fuelType;
    }
    public void setFuelType(String fuelType) 
    {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() 
    {
        return transmissionType;
    }
    public void setTransmissionType(String transmissionType) 
    {
        this.transmissionType = transmissionType;
    }

    public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }

    public int getNumberOfSeats() 
    {
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats) 
    {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isAvailable() 
    {
        return available;
    }
    public void setAvailable(boolean available) 
    {
        this.available = available;
    }
}