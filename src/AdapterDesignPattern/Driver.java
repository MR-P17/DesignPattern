package AdapterDesignPattern;

import AdapterDesignPattern.Adaptee.WeightOfBabiesInPound;
import AdapterDesignPattern.Adapter.WeightOfBabyInKg;

public class Driver {
    public static void main(String[] args) {
        WeightOfBabyInKg weightOfBabyInKg = new WeightOfBabyInKg(new WeightOfBabiesInPound());
        float weight = weightOfBabyInKg.getWeightInKg();
        System.out.println("Weight in Kg : "+ weight);
    }

}
