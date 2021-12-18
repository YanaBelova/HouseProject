package y.belova.houseProject.creation;

import y.belova.houseProject.apartment.FlatFactory;
import y.belova.houseProject.floor.Floor;

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
}
