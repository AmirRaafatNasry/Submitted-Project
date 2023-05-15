public class Customer extends Human {
    // Attributes
    private String email;
    private String phoneNumber;
    private RentableCar rentedCar;
    private SellableCar boughtCar;

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

    public RentableCar getRentedCar() {
        return rentedCar;
    }

    public void setRentedCars(RentableCar rentableCar) {
        this.rentedCar = rentableCar;
    }

    public SellableCar getBoughtCar() {
        return boughtCar;
    }

    public void setBoughtCars(SellableCar boughtCar) {
        this.boughtCar = boughtCar;
    }

}