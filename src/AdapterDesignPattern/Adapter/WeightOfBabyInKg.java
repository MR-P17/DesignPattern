package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeightInPound;
import AdapterDesignPattern.Adaptee.WeightOfBabiesInPound;

public class WeightOfBabyInKg implements WeightInKg{
    WeightOfBabiesInPound weightOfBabiesInPound;
    public WeightOfBabyInKg(WeightOfBabiesInPound weightOfBabiesInPound){
        this.weightOfBabiesInPound = weightOfBabiesInPound;
    }

    @Override
    public float getWeightInKg() {
        int weight = weightOfBabiesInPound.getWeightInPound();
        float weightInKg = weight * 0.45F;
        return weightInKg;
    }
}
