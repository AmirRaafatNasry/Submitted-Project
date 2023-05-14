public class Storage {
    static int max = 50; // To avoid magic number
    static int rentableCarCount = 0;
    static int sellableCarCount = 0;

    static Employee admin = new Employee("admin", "admin");
    static Customer customer;

    static RentableCar rentableCar[] = new RentableCar[max];
    static SellableCar sellableCar[] = new SellableCar[max];
}