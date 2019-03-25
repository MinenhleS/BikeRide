package bicycles;

import specialriding.FunRide;
import specbicycle.BicycleFromSpec;
import specbicycle.BicycleSpecification;
import specbicycle.BicycleType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void shouldRunEnteredCount() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(tandemBikeSpec);

        FunRide funRide = new FunRide(3);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);




        assertEquals(funRide.getEnteredCount(), 3);

    }


    @Test
    public void shouldAvoidDuplicationOfRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(tandemBikeSpec);

        FunRide funRide = new FunRide(7);

        funRide.accept(bicycle2);
        funRide.accept(bicycle3);
        funRide.accept(bicycle2);
        funRide.accept(bicycle3);
        funRide.accept(bicycle1);
        funRide.accept(bicycle3);

        assertEquals(funRide.getEnteredCount(), 3);


    }

    @Test
    public void shouldRunBikeType() {

        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);


        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(tandemBikeSpec);

        FunRide funRide = new FunRide(5);

        funRide.accept(bicycle2);
        funRide.accept(bicycle3);
        funRide.accept(bicycle2);



        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 1);

    }


}
