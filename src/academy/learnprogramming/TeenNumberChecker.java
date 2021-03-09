package academy.learnprogramming;

public class TeenNumberChecker {
    public static boolean hasTeen (int firstNum, int secondNum, int thirdNum){
        boolean isTeen = false;

        boolean isTeenOne = (firstNum >= 13 && firstNum <= 19) ;
        boolean isTeenTwo = secondNum >= 13 && secondNum <= 19;
        boolean isTeenThree = thirdNum >= 13 && thirdNum <= 19;

        if (isTeenOne || isTeenTwo || isTeenThree){
            isTeen = true;
        }

        return isTeen;
    }

    public static boolean isTeen (int firstNum){
        boolean isTeen = false;

        boolean isTeenOne = (firstNum >= 13 && firstNum <= 19) ;

        if (isTeenOne){
            isTeen = true;
        }

        return isTeen;
    }

}
