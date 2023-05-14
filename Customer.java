public class Customer extends Human
{
    private String email;
    private int phoneNumber;
    private int rentedCars[] = new int[50];
    private int boughtCars[] = new int[50];

    // Constructor
    public Customer(String email, String username, String password, int phoneNumber)
    {
        super(username, password);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters (Accessors) & Setters (Mutators)
    public String getEmail() 
    {
        return email;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public int getPhoneNumber() 
    {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public int[] getRentedCars() 
    {
        return rentedCars;
    }
    public void setRentedCars(int[] rentedCars) 
    {
        this.rentedCars = rentedCars;
    }

    public int[] getBoughtCars() 
    {
        return boughtCars;
    }
    public void setBoughtCars(int[] boughtCars) 
    {
        this.boughtCars = boughtCars;
    }

}
