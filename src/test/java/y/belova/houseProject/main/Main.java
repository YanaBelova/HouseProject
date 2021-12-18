package y.belova.houseProject.main;

import y.belova.houseProject.house.House;
import y.belova.houseProject.utils.InputUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> listOfHouses = new ArrayList<>();
        boolean bool = true;
        do{
            House house = new House();
            house.getFloors();
            listOfHouses.add(house);
            System.out.println("Would you like to build one more house? \n Yes - click any symbol           No - click 0");
            int nextFloor = InputUtils.inputIntValue();
            if(nextFloor == 0)
                bool =false;
        }while (bool);

    }
}
