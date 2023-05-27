package SnakeAndLadderLLD;

import java.util.Random;

public class Dice {
    int diceCount;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int getDiceCount() {
        return diceCount;
    }

    public int rollDice(){
        int count = this.diceCount;
        int value = 0;
        while(count > 0){
            Random rand = new Random();
            int upperbound = 6;
            value += rand.nextInt(upperbound) + 1;
            count --;
        }
        return value;
    }
}
