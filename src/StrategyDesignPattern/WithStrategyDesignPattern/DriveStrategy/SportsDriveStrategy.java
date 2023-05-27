package StrategyDesignPattern.WithStrategyDesignPattern.DriveStrategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Sports drive functionality");
    }
}
