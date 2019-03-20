package bicycles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunRideTest {

    @Test
    public void ShouldRunSpecFunRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(tandemBikeSpec);

        FunRide funRide = new FunRide(5);

        funRide.accept(bicycle1);
        funRide.accept(bicycle2);
        funRide.accept(bicycle1);
        funRide.accept(bicycle3);
        funRide.accept(bicycle1);
        funRide.accept(bicycle2);


        assertEquals(funRide.getEnteredCount(), 5);
        assertEquals(funRide.getCountForType(BicycleType.RoadBike), 3);




    }


    @Test
    public void ShouldRunSecondFunRide() {
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
        funRide.accept(bicycle2);
        funRide.accept(bicycle2);
        funRide.accept(bicycle2);


        assertEquals(funRide.getEnteredCount(), 3);
        assertEquals(funRide.getCountForType(BicycleType.MountainBike), 1);

    }

    @Test
    public void ShouldRunThirdFunRide() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);
        BicycleSpecification mountainBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);
        BicycleSpecification tandemBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);

        Bicycle bicycle1 = new BicycleFromSpec(roadBikeSpec);
        Bicycle bicycle2 = new BicycleFromSpec(mountainBikeSpec);
        Bicycle bicycle3 = new BicycleFromSpec(tandemBikeSpec);

        FunRide funRide = new FunRide(5);

        funRide.accept(bicycle3);
        funRide.accept(bicycle3);
        funRide.accept(bicycle1);
        funRide.accept(bicycle3);



        assertEquals(funRide.getEnteredCount(), 4);
        assertEquals(funRide.getCountForType(BicycleType.Tandem), 3);




    }

}