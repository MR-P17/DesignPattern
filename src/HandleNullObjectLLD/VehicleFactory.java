package HandleNullObjectLLD;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleName){
        if(vehicleName.equals("Car"))
            return new Car();
        else
            return new NullVehicle();
    }
}
