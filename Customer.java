public class Customer extends Human {
    // Attributes
    private String email;
    private String phoneNumber;
    private RentableCar rentedCars;
    private SellableCar boughtCars;

    // Constructor
    public Customer(String email, String username, String password, String phoneNumber) {
        super(username, password);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters & Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public RentableCar getRentedCars() {
        return rentedCars;
    }

    public void setRentedCars(RentableCar rentableCar) {
        this.rentedCars = rentableCar;
    }

    public SellableCar getBoughtCars() {
        return boughtCars;
    }

    public void setBoughtCars(SellableCar boughtCars) {
        this.boughtCars = boughtCars;
    }

}