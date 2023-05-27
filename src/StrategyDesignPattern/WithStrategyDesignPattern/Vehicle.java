package StrategyDesignPattern.WithStrategyDesignPattern;

import StrategyDesignPattern.WithStrategyDesignPattern.DriveStrategy.DriveStrategy;

public class Vehicle {
    DriveStrategy strategy;

    public Vehicle(DriveStrategy strategy){
        this.strategy = strategy;
    }

    public void drive(){
        this.strategy.drive();;
    }
}
