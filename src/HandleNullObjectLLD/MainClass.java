package HandleNullObjectLLD;

public class MainClass {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicle("Car");
        printVehicleDetails(vehicle);
    }

    public static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Seat Capacity is: "+ vehicle.seatCapacity);
        System.out.println("Fuel Capacity is: "+ vehicle.fuelCapacity);
    }
}
