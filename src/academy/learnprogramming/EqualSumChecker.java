package academy.learnprogramming;

public class EqualSumChecker {

    public static boolean hasEqualSUm (int firstNum, int secondNum, int thirdNum) {
        boolean sumEquals = false;

        if (firstNum + secondNum == thirdNum){
            sumEquals = true;
        }

        return sumEquals;
    }
}
