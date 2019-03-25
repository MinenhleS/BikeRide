package bicycles.allrides;

import bicycles.Bicycle;

import org.junit.jupiter.api.Test;
import bicycles.specbicycle.BicycleFromSpec;
import bicycles.specbicycle.BicycleSpecification;
import bicycles.specbicycle.BicycleType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeRideTest {

    //RoadBike
    @Test
    public void ShouldRunBikeOneRoadBikeCurrentSpeed() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 36);

    }

    //MountainBike
    @Test
    public void ShouldRunBikeTwoMountainBikeCurrentSpeed() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRidetwo bikeRide = new BikeRidetwo(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 5);

    }

    //Tandem
    @Test
    public void ShouldRunBikeThreeTandemCurrentSpeed() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();

        assertEquals(bikeRide.currentSpeed(), 34);

    }
}
