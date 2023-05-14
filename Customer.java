public class Customer extends Human
{
    private String email;
    private int phoneNumber;
    private Rent rentedCars;
    private Sell boughtCars;

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

    public Rent getRentedCars() 
    {
        return rentedCars;
    }
    public void setRentedCars(Rent rentableCar) 
    {
        this.rentedCars = rentableCar;
    }

    public Sell getBoughtCars() 
    {
        return boughtCars;
    }
    public void setBoughtCars(Sell boughtCars) 
    {
        this.boughtCars = boughtCars;
    }

}
