package y.belova.houseProject.apartment;

public abstract class Apartment {
    private int numberOfRooms;
    private double square;
    private int numberOfPeopleLiving;
    Apartment(int numberOfRooms, double square, int numberOfPeopleLiving){
        this.numberOfRooms = numberOfRooms;
        this.square = square;
        this.numberOfPeopleLiving = numberOfPeopleLiving;
    }
    public int getNumberOfRooms(){
        return numberOfRooms;
    }
    public double getSquare(){
        return square;
    }
    public int getNumberOfPeopleLiving(){
        return numberOfPeopleLiving;
    }
}
