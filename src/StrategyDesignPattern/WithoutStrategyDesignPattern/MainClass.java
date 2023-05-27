package StrategyDesignPattern.WithoutStrategyDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.drive();

        Vehicle vehicle2 = new SportsVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new PassengerVehicle();
        vehicle3.drive();

        Vehicle vehicle4 = new OffRoadVehicle();
        vehicle4.drive();

        Vehicle vehicle5 = new GoodsVehicle();
        vehicle5.drive();
    }
}
