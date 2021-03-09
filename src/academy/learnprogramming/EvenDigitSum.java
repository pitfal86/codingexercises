package academy.learnprogramming;

public class EvenDigitSum {

    public static int getEvenDigitSum (int number){
        boolean isValidNumber = (number * -1 <= 0);
        int sumEven = 0;

        if (isValidNumber){
            while (number > 0){
                int digit = number % 10;
                if (digit % 2 ==0){
                    sumEven += digit;
                }
                number /= 10;
            }

        } else {
            sumEven = -1;
        }
        System.out.println(sumEven);
        return sumEven;
    }

}
