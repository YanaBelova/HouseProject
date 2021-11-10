package y.belova.houseProject.utils;

import java.util.Scanner;

public class Utils {
    static Scanner in = new Scanner(System.in);
    public static int inputIntValue(){
         return in.nextInt();
    }
    public static boolean checkingForAPositiveValueOfAVariable(int value){
        return  (value > 0);
    }
    public static boolean checkingForAPositiveValueOfAVariable(double value){
        return  (value > 0);
    }
    public static boolean enteredValueInTheCorrectRange(int value){
        return (value>=1 && value <=4);
    }
    public static boolean objectIsCreated(Object obj){
        return obj!=null;
    }
}
