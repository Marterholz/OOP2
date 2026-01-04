public class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        return basePrice * 0.08 + passengerCapacity * 20;
    }

    @Override
    public void performService() {
        System.out.println("Bus service performed for vehicle ID " + id);
    }

    @Override
    public int getServiceIntervalKm() {
        return 15000;
    }
}
