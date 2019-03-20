package BikePackage;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideThree implements BikeRide {


    private final Bicycle bicycle;

//    Bicycle bicycle = new Bicycle();


    public BikeRideThree(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public int currentSpeed(){

        return this.bicycle.currentSpeed();
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.accelerate();
    }

}
