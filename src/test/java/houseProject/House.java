package houseProject;
import org.junit.Assert;
import java.util.ArrayList;
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
        for (int i =0; i< list.size(); i++){
            resultSquare += list.get(i).squareOfFloor();
        }
        return resultSquare;
    }

    public double resultPeopleOfHouse(List<Floor> list){
        for (int i =0; i< list.size(); i++){
            numberOfAllPeople += list.get(i).numberOfPeopleInTheFloor();
        }
        return numberOfAllPeople;
    }

    public Floor createFloor(int numberOfFirstFlat, int numberOfSecondFlat, int numberOfThirdFlat, int numberOfFourFlat){
        Floor floor = new Floor(flatFactory.createFlat(numberOfFirstFlat), flatFactory.createFlat(numberOfSecondFlat),
                flatFactory.createFlat(numberOfThirdFlat), flatFactory.createFlat(numberOfFourFlat));
        Assert.assertTrue("Object Floor isn't created", Utils.objectIsCreated(floor));
        return floor;
    }

    public void createFloors(){
        resultSquare =0;
        numberOfAllPeople = 0;
        int numberOfApartment =1;
        boolean bool = true;
        List<Floor> floorList = new ArrayList<>();
        do {
            System.out.println(String.format("%s%d%s","Building a floor \nInput number of rooms in the " ,numberOfApartment, " apartment: \n(from 1 to 4)"));
            int first = Utils.inputIntValue();
            Assert.assertTrue("Entered a number in the wrong range", Utils.enteredValueInTheCorrectRange(first));
            System.out.println(String.format("%s%d%s","Input number of rooms in the " ,(numberOfApartment+1) , " apartment: \n(from 1 to 4)"));
            int second = Utils.inputIntValue();
            Assert.assertTrue("Entered a number in the wrong range", Utils.enteredValueInTheCorrectRange(second));
            System.out.println(String.format("%s%d%s","Input number of rooms in the " ,(numberOfApartment+2) , " apartment: \n(from 1 to 4)"));
             int third = Utils.inputIntValue();
            Assert.assertTrue("Entered a number in the wrong range", Utils.enteredValueInTheCorrectRange(third));
            System.out.println(String.format("%s%d%s","Input number of rooms in the " ,(numberOfApartment+3) , " apartment: \n(from 1 to 4)"));
            int forth = Utils.inputIntValue();
            Assert.assertTrue("Entered a number in the wrong range", Utils.enteredValueInTheCorrectRange(forth));
//            Floor floor = new Floor(flatFactory.createFlat(first), flatFactory.createFlat(second), flatFactory.createFlat(third), flatFactory.createFlat(forth));
//            Assert.assertTrue("Object isn't created", Utils.objectIsCreated(floor));
            floorList.add(createFloor(first,second,third,forth));
            numberOfApartment +=4;
            System.out.println("Do you want to build another floor? \n Yes - click any symbol           No - click 0");
            int nextFloor = Utils.inputIntValue();
            if(nextFloor == 0)
                bool =false;
            }while (bool == true);
        System.out.println("Number of floors in the house: " + floorList.size());
        System.out.println("Resulting house area: " + resultSquareOfHouse(floorList) +
                "\nNumber of people living in the house: " + resultPeopleOfHouse(floorList));
    }
}
