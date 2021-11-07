package houseProject;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> listOfHouses = new ArrayList<>();
        boolean bool = true;
        do{
            House house = new House();
            Assert.assertTrue("Object House isn't created", Utils.objectIsCreated(house));
            house.createFloors();
            listOfHouses.add(house);
            System.out.println("Would you like to build one more house? \n Yes - click any symbol           No - click 0");
            int nextFloor = Utils.inputIntValue();
            if(nextFloor == 0)
                bool =false;
        }while (bool);

    }
}
