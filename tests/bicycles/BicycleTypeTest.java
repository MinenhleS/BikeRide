package bicycles;

import allrides.BikeRideOne;
import allrides.BikeRideThree;
import allrides.BikeRidetwo;
import specbicycle.BicycleFromSpec;
import specbicycle.BicycleSpecification;
import specbicycle.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTypeTest {


    //RoadBike
        @Test
        public void ShouldRunSpecBikeOne() {
            BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
            Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
            BikeRideOne bikeRide = new BikeRideOne(bicycle);
            bikeRide.ride();


            assertEquals(roadBikeSpec.getAccelerationSpeed(),11);
            assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
            assertEquals(roadBikeSpec.getBicycleType().toString(),"RoadBike");
            assertEquals(bikeRide.currentSpeed(), 36);

        }
    //MountainBike
    @Test
    public void ShouldRunSpecMBikeOne() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();


        assertEquals(roadBikeSpec.getAccelerationSpeed(),5);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -3);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"MountainBike");
        assertEquals(bikeRide.currentSpeed(), 14);

    }

    //tandem
    @Test
    public void ShouldRunSpecTBikeOne() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();


        assertEquals(roadBikeSpec.getAccelerationSpeed(),12);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -7);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"Tandem");
        assertEquals(bikeRide.currentSpeed(), 34);

    }
    //RoadBike
    @Test
    public void ShouldRunSpecBikeTwo() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRidetwo bikeRide = new BikeRidetwo(bicycle);
        bikeRide.ride();


        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"RoadBike");
        assertEquals(bikeRide.currentSpeed(), 24);

    }
        //MountainBike
    @Test
    public void ShouldRunSpecMBikeTwo() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRidetwo bikeRide = new BikeRidetwo(bicycle);
        bikeRide.ride();


        assertEquals(roadBikeSpec.getAccelerationSpeed(),5);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -3);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"MountainBike");
        assertEquals(bikeRide.currentSpeed(), 5);

    }

    //Tandem
    @Test
    public void ShouldRunSpecTBikeTwo() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRidetwo bikeRide = new BikeRidetwo(bicycle);
        bikeRide.ride();


        assertEquals(roadBikeSpec.getAccelerationSpeed(),12);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -7);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"Tandem");
        assertEquals(bikeRide.currentSpeed(), 13);

    }
        //RoadBike
    @Test
    public void ShouldRunSpecBikeThree() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideThree bikeRide = new BikeRideThree(bicycle);
        bikeRide.ride();


        assertEquals(roadBikeSpec.getAccelerationSpeed(),11);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"RoadBike");
        assertEquals(bikeRide.currentSpeed(), 69);

    }
        //Mountain
    @Test
    public void ShouldRunSpecMBikeThree() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();


        assertEquals(roadBikeSpec.getAccelerationSpeed(),5);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -3);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"MountainBike");
        assertEquals(bikeRide.currentSpeed(), 14);

    }


    //Tandem
    @Test
    public void ShouldRunSpecTBikeThree() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        Bicycle bicycle = new BicycleFromSpec(roadBikeSpec);
        BikeRideOne bikeRide = new BikeRideOne(bicycle);
        bikeRide.ride();


        assertEquals(roadBikeSpec.getAccelerationSpeed(),12);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -7);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"Tandem");
        assertEquals(bikeRide.currentSpeed(), 34);

    }
}
