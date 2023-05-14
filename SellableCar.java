public class SellableCar extends Car {
    // Constructor
    public SellableCar(String accessibility, String bodyType, String fuelType, String transmissionType, String color,
            int numberOfSeats) {
        super(accessibility, bodyType, fuelType, transmissionType, color, numberOfSeats);
        Storage.sellableCarCount++;
    }
}