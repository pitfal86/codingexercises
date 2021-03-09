package academy.learnprogramming;

public class SumOddRange {

    public static boolean isOdd (int number){
        boolean isValidNumber = (number > 0);
        if (isValidNumber){
            if (number % 2 == 0){
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd (int start, int end) {
        boolean isValidStart = (start > 0);
        boolean isValidEnd = ((end > 0) && (end >= start));
        int sumTotal = 0;

        if (isValidStart && isValidEnd){
            for (int i = start; i <= end; i ++){
                if (isOdd(i)){
                    sumTotal += i;
                }
            }
        } else {
            sumTotal = -1;
        }
        return sumTotal;
    }


}
