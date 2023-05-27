package StrategyDesignPattern.WithStrategyDesignPattern;


public class MainClass {
    public static void main(String[] args) {
        Vehicle v1 = new SportsVehicle();
        v1.drive();

        Vehicle v2 = new PassengerVehicle();
        v2.drive();

        Vehicle v3 = new OffRoadVehicle();
        v3.drive();

        Vehicle v4 = new GoodsVehicle();
        v4.drive();
    }
}
