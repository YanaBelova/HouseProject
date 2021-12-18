package y.belova.houseProject.house;
import y.belova.houseProject.accsystem.AccountingSystem;
import y.belova.houseProject.apartment.FlatFactory;
import y.belova.houseProject.creation.FloorCreation;
import y.belova.houseProject.floor.Floor;
import java.util.List;

public class House {
    private FlatFactory flatFactory = new FlatFactory();
    private double resultSquare;
    private int numberOfAllPeople;

    private double getResultSquare(){
        return resultSquare;
    }

    public int getNumberOfAllPeople(){
        return numberOfAllPeople;
    }

    public double resultSquareOfHouse(List<Floor> list){
       return AccountingSystem.getInstanceAccountingSystem().resultSquareOfHouse(list);
    }

    public double resultPeopleOfHouse(List<Floor> list){
       return AccountingSystem.getInstanceAccountingSystem().resultPeopleOfHouse(list);
    }

    public void getFloors(){
        FloorCreation.getInstanceFloorCreation().createFloors();
    }
}
