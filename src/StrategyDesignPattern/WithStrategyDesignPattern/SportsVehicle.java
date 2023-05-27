package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.DriveStrategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle(){
        super(new SportsDriveStrategy());
    }
}
