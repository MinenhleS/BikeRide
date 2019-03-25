package bicycles;

import bicycles.specbicycle.BicycleType;

public interface Bicycle {

     void accelerate();

     void brake();

    int currentSpeed();

    void stop();

    public BicycleType getBicycleType();


}
