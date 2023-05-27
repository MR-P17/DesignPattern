package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.DriveStrategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle(){
        super(new NormalDriveStrategy());
    }
}
