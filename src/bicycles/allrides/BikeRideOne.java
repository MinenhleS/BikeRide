package bicycles.allrides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRideOne implements BikeRide {

    private final Bicycle bicycle;

//    Bicycle bicycle = new Bicycle();


    public BikeRideOne(Bicycle bicycle) {
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
        this.bicycle.brake();
        this.bicycle.accelerate();
    }


    public boolean type() {
        return true;
    }
}
