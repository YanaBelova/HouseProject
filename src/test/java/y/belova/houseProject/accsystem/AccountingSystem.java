package y.belova.houseProject.accsystem;

import y.belova.houseProject.floor.Floor;

import java.util.List;

public class AccountingSystem {

    private static AccountingSystem accountingSystem;
    private AccountingSystem(){}

    public static AccountingSystem getInstanceAccountingSystem(){
        if(accountingSystem == null){
            accountingSystem = new AccountingSystem();
        }
        return accountingSystem;
    }

    public double resultSquareOfHouse(List<Floor> list){
        int resultSquare =0;
        for (int i =0; i< list.size(); i++){
            resultSquare += list.get(i).squareOfFloor();
        }
        return resultSquare;
    }

    public double resultPeopleOfHouse(List<Floor> list){
        int numberOfAllPeople = 0;
        for (int i =0; i< list.size(); i++){
            numberOfAllPeople += list.get(i).numberOfPeopleInTheFloor();
        }
        return numberOfAllPeople;
    }

}
