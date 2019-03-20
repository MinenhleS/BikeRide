/* bicycles.models;

import bicycles.BicycleBase;
import bicycles.BicycleType;

public class Tandem extends BicycleBase {

    @Override
    public void accelerate(){
        changeSpeed(speed += 12);
    }
    public void brake(){
        changeSpeed(speed -= 7);
    }


    public BicycleType bicycletype() {
        return BicycleType.Tandem;
    }
}
*/