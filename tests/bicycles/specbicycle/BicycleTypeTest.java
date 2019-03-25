package bicycles.specbicycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BicycleTypeTest {


    //RoadBike
        @Test
        public void ShouldRunSpecRoadBikeBikeOne() {
            BicycleSpecification roadBikeSpec = new BicycleSpecification(11, -4, BicycleType.RoadBike);

            assertEquals(roadBikeSpec.getAccelerationSpeed(),11);
            assertEquals(roadBikeSpec.getBrakeSpeed(), -4);
            assertEquals(roadBikeSpec.getBicycleType().toString(),"RoadBike");


        }

        //MountainBike
    @Test
    public void ShouldRunSpecMountainBikeBikeTwo() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(5, -3, BicycleType.MountainBike);

        assertEquals(roadBikeSpec.getAccelerationSpeed(),5);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -3);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"MountainBike");

    }


    //Tandem
    @Test
    public void ShouldRunSpecTandemBikeThree() {
        BicycleSpecification roadBikeSpec = new BicycleSpecification(12, -7, BicycleType.Tandem);
        assertEquals(roadBikeSpec.getAccelerationSpeed(),12);
        assertEquals(roadBikeSpec.getBrakeSpeed(), -7);
        assertEquals(roadBikeSpec.getBicycleType().toString(),"Tandem");


    }
}
