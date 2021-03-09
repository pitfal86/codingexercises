package academy.learnprogramming;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {
        boolean isEqual = false;

        int firstCheck = (int) (numberOne * 1000);
        int seccondCheck = (int) (numberTwo * 1000);

        System.out.println(firstCheck);
        System.out.println(seccondCheck);

        if (firstCheck - seccondCheck == 0){
            isEqual = true;
        }
        return isEqual;
    }
}
