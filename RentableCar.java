public class RentableCar extends Car {
    // Constructor
    public RentableCar(String accessibility, String bodyType, String fuelType, String transmissionType, String color,
            int numberOfSeats) {
        super(accessibility, bodyType, fuelType, transmissionType, color, numberOfSeats);
        Storage.rentableCarCount++;
    }
}
