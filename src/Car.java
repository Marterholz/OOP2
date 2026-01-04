public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.05 + getAge(2025) * 50;
    }

    @Override
    public void performService() {
        System.out.println("Car service performed for vehicle ID " + id);
    }

    @Override
    public int getServiceIntervalKm() {
        return 10000;
    }
}
