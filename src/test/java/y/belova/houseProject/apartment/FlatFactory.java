package y.belova.houseProject.apartment;

import org.junit.Assert;
import y.belova.houseProject.utils.Utils;

public class FlatFactory {
    final private int numberOfOneRoomFlat =1;
    final private int numberOfTwoRoomedFlat =2;
    final private int numberOfThreeRoomedFlat =3;
    final private int numberOfFourRoomedFlat =1;
    public Apartment createFlat(int numberOfRooms){
        Apartment flat = null;
        switch (numberOfRooms){
            case 1:
                System.out.println("Input square of one-room apartment: ");
                double squareOfOneRoomFlat = Utils.inputIntValue();
                Assert.assertTrue("Input value should be more than 0", Utils.checkingForAPositiveValueOfAVariable(squareOfOneRoomFlat));
                System.out.println("Enter the number of people who live in a one-room apartment: ");
                int numberOfPeopleInOneRoomFlat = Utils.inputIntValue();
                Assert.assertTrue("Input value should be more than 0", Utils.checkingForAPositiveValueOfAVariable(numberOfPeopleInOneRoomFlat));
                flat = new OneRoomFlat(numberOfOneRoomFlat, squareOfOneRoomFlat,numberOfPeopleInOneRoomFlat);
                Assert.assertTrue("Object Apartment isn't created", Utils.objectIsCreated(flat));
                break;
            case 2:
                System.out.println("Input square of two-roomed apartment: ");
                double squareOfTwoRoomedFlat = Utils.inputIntValue();
                Assert.assertTrue("Input value should be more than 0", Utils.checkingForAPositiveValueOfAVariable(squareOfTwoRoomedFlat));
                System.out.println("Enter the number of people who live in a two-roomed apartment: ");
                int numberOfPeopleInTwoRoomedFlat = Utils.inputIntValue();
                Assert.assertTrue("Input value should be more than 0", Utils.checkingForAPositiveValueOfAVariable(numberOfPeopleInTwoRoomedFlat));
                flat = new TwoRoomedFlat(numberOfTwoRoomedFlat, squareOfTwoRoomedFlat,numberOfPeopleInTwoRoomedFlat);
                Assert.assertTrue("Object Apartment isn't created", Utils.objectIsCreated(flat));
                break;
            case 3:
                System.out.println("Input square of three-roomed apartment: ");
                double squareOfThreeRoomedFlat = Utils.inputIntValue();
                Assert.assertTrue("Input value should be more than 0", Utils.checkingForAPositiveValueOfAVariable(squareOfThreeRoomedFlat));
                System.out.println("Enter the number of people who live in a three-roomed apartment: ");
                int numberOfPeopleInThreeRoomedFlat = Utils.inputIntValue();
                Assert.assertTrue("Input value should be more than 0", Utils.checkingForAPositiveValueOfAVariable(numberOfPeopleInThreeRoomedFlat));
                flat = new ThreeRoomedFlat(numberOfThreeRoomedFlat, squareOfThreeRoomedFlat, numberOfPeopleInThreeRoomedFlat);
                Assert.assertTrue("Object Apartment isn't created", Utils.objectIsCreated(flat));
                break;
            case 4:
                System.out.println("Input square of four-roomed apartment: ");
                double squareOfFourRoomedFlat = Utils.inputIntValue();
                Assert.assertTrue("Input value should be more than 0", Utils.checkingForAPositiveValueOfAVariable(squareOfFourRoomedFlat));
                System.out.println("Enter the number of people who live in a four-roomed apartment: ");
                int numberOfPeopleInFourRoomedFlat = Utils.inputIntValue();
                Assert.assertTrue("Input value should be more than 0", Utils.checkingForAPositiveValueOfAVariable(numberOfPeopleInFourRoomedFlat));
                flat = new FourRoomedFlat(numberOfFourRoomedFlat, squareOfFourRoomedFlat,numberOfPeopleInFourRoomedFlat);
                Assert.assertTrue("Object Apartment isn't created", Utils.objectIsCreated(flat));
                break;
        }
        return flat;
    }
}
