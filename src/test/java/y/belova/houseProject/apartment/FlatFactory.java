package y.belova.houseProject.apartment;

import y.belova.houseProject.utils.InputUtils;

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
                double squareOfOneRoomFlat = InputUtils.inputIntValue();
                System.out.println("Enter the number of people who live in a one-room apartment: ");
                int numberOfPeopleInOneRoomFlat = InputUtils.inputIntValue();
                flat = new OneRoomFlat(numberOfOneRoomFlat, squareOfOneRoomFlat,numberOfPeopleInOneRoomFlat);
                break;
            case 2:
                System.out.println("Input square of two-roomed apartment: ");
                double squareOfTwoRoomedFlat = InputUtils.inputIntValue();
                System.out.println("Enter the number of people who live in a two-roomed apartment: ");
                int numberOfPeopleInTwoRoomedFlat = InputUtils.inputIntValue();
                flat = new TwoRoomedFlat(numberOfTwoRoomedFlat, squareOfTwoRoomedFlat,numberOfPeopleInTwoRoomedFlat);
                break;
            case 3:
                System.out.println("Input square of three-roomed apartment: ");
                double squareOfThreeRoomedFlat = InputUtils.inputIntValue();
                System.out.println("Enter the number of people who live in a three-roomed apartment: ");
                int numberOfPeopleInThreeRoomedFlat = InputUtils.inputIntValue();
                flat = new ThreeRoomedFlat(numberOfThreeRoomedFlat, squareOfThreeRoomedFlat, numberOfPeopleInThreeRoomedFlat);
                break;
            case 4:
                System.out.println("Input square of four-roomed apartment: ");
                double squareOfFourRoomedFlat = InputUtils.inputIntValue();
                System.out.println("Enter the number of people who live in a four-roomed apartment: ");
                int numberOfPeopleInFourRoomedFlat = InputUtils.inputIntValue();
                flat = new FourRoomedFlat(numberOfFourRoomedFlat, squareOfFourRoomedFlat,numberOfPeopleInFourRoomedFlat);
                break;
        }
        return flat;
    }
}
