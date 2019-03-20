package bicycles;

import java.util.ArrayList;
import java.util.List;

public class FunRide {

    //int countBikes = 0;
    int totCountBikes;
    int maxNum;
    String BikeType;

    public FunRide(int maxNum){

        this.maxNum = maxNum;
    }

    ArrayList<Bicycle> list = new ArrayList<Bicycle>();


    public void accept(Bicycle bicycle){

            if(maxNum > totCountBikes) {

               list.add(bicycle);
               totCountBikes ++;
               System.out.println("Accepted");
            }
            else{

                System.out.println("Rejected");
            }
    }

    public int getCountForType(BicycleType bicycleType){
        int countBike = 0;
        //this.bicycleSpecification.getBicycleType();
        for(int i = 0; i < list.size();i++){


            if(list.get(i).getBicycleType()== bicycleType){

//                int countBike = 0;
                countBike++;
            }
        }

        return countBike;
    }

    public int getEnteredCount(){


        return list.size();
    }

}
