package y.belova.houseProject.floor;

import y.belova.houseProject.apartment.Apartment;

public class Floor {
    private Apartment apartment1;
    private Apartment apartment2;
    private Apartment apartment3;
    private Apartment apartment4;

    public Floor(Apartment apartment1, Apartment apartment2, Apartment apartment3, Apartment apartment4){
        this.apartment1 = apartment1;
        this.apartment2 = apartment2;
        this.apartment3 = apartment3;
        this.apartment4 = apartment4;
    }

    public Apartment getApartment1(){
        return apartment1;
    }

    public Apartment getApartment2(){
        return apartment2;
    }

    public Apartment getApartment3(){
        return apartment3;
    }

    public Apartment getApartment4(){
        return apartment4;
    }

    public double squareOfFloor(){
        return (apartment1.getSquare()+apartment2.getSquare()+apartment3.getSquare()+apartment4.getSquare());
    }

    public int numberOfPeopleInTheFloor(){
        return (apartment1.getNumberOfPeopleLiving()+apartment2.getNumberOfPeopleLiving()+apartment3.getNumberOfPeopleLiving()+apartment4.getNumberOfPeopleLiving());
    }
}
