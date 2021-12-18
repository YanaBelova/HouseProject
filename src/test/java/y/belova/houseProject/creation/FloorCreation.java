package y.belova.houseProject.creation;

import y.belova.houseProject.apartment.FlatFactory;
import y.belova.houseProject.floor.Floor;
import y.belova.houseProject.utils.InputUtils;
import java.util.ArrayList;
import java.util.List;

public class FloorCreation {
    private FlatFactory flatFactory = new FlatFactory();
    private static FloorCreation floor;
    private FloorCreation(){}

    public static FloorCreation getInstanceFloorCreation(){
        if(floor == null){
            floor = new FloorCreation();
        }
        return floor;
    }

    public Floor createFloor(int numberOfFirstFlat, int numberOfSecondFlat, int numberOfThirdFlat, int numberOfFourFlat){
        Floor floor = new Floor(flatFactory.createFlat(numberOfFirstFlat), flatFactory.createFlat(numberOfSecondFlat),
                flatFactory.createFlat(numberOfThirdFlat), flatFactory.createFlat(numberOfFourFlat));
        return floor;
    }

    public void createFloors(){
        int numberOfApartment =1;
        boolean bool = true;
        List<Floor> floorList = new ArrayList<>();
        do {
            System.out.println(String.format("%s%d%s","Building a floor \nInput number of rooms in the " ,numberOfApartment, " apartment: \n(from 1 to 4)"));
            int first = InputUtils.inputIntValue();
            System.out.println(String.format("%s%d%s","Input number of rooms in the " ,(numberOfApartment+1) , " apartment: \n(from 1 to 4)"));
            int second = InputUtils.inputIntValue();
            System.out.println(String.format("%s%d%s","Input number of rooms in the " ,(numberOfApartment+2) , " apartment: \n(from 1 to 4)"));
            int third = InputUtils.inputIntValue();
            System.out.println(String.format("%s%d%s","Input number of rooms in the " ,(numberOfApartment+3) , " apartment: \n(from 1 to 4)"));
            int forth = InputUtils.inputIntValue();
            floorList.add(getInstanceFloorCreation().createFloor(first,second,third,forth));
            numberOfApartment +=4;
            System.out.println("Do you want to build another floor? \n Yes - click any symbol           No - click 0");
            int nextFloor = InputUtils.inputIntValue();
            if(nextFloor == 0)
                bool =false;
        }while (bool == true);
        System.out.println("Number of floors in the house: " + floorList.size());
    }
}
