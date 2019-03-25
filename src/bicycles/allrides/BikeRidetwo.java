package bicycles.allrides;

import bicycles.Bicycle;
import bicycles.BikeRide;

public class BikeRidetwo implements BikeRide {

    private final Bicycle bicycle;

//    Bicycle bicycle = new Bicycle();


    public BikeRidetwo(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public int currentSpeed(){

        return this.bicycle.currentSpeed();
    }

    public void ride() {
        this.bicycle.accelerate();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.brake();
        this.bicycle.accelerate();
        this.bicycle.brake();
    }


}
