package bicycles;

import bicycles.Bicycle;
import bicycles.BikeRide;

public abstract class BicycleBase implements Bicycle {

    protected int speed;

    protected void changeSpeed( int addToSpeed){

         speed += addToSpeed;
    }

    public int currentSpeed() {

        if (speed < 0) {
            return 0;
        } else {

            return speed;
        }
    }

    public void stop(){


        speed = 0;
//            return speed;
    }

}
