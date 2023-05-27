package HandleNullObjectLLD;

public class Vehicle {
    int seatCapacity;
    int fuelCapacity;

    public Vehicle(int seatCapacity, int fuelCapacity) {
        this.seatCapacity = seatCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }
}
