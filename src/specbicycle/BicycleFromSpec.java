package specbicycle;

import bicycles.BicycleBase;

public class BicycleFromSpec extends BicycleBase {
    private final BicycleSpecification bicycleSpecification;




    public BicycleFromSpec(BicycleSpecification bicycleSpecification) {
        this.bicycleSpecification = bicycleSpecification;
    }

    @Override
    public void accelerate(){
        this.changeSpeed(this.bicycleSpecification.getAccelerationSpeed());
    }
    public void brake(){
        this.changeSpeed(this.bicycleSpecification.getBrakeSpeed());

    }
    public BicycleType getBicycleType(){
        return this.bicycleSpecification.getBicycleType();

    }

}
