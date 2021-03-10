package academy.learnprogramming;

public class LargestPrime {

    public static int getLargestPrime (int number){
        boolean isValidNum = (number >= 0);
        int mainNumber = number;
        int counter = 0;
        if (isValidNum){
            boolean isPrime;
            while(number > 0 ){
                isPrime = (mainNumber % number == 0);
                if (counter > 0 && isPrime){
                    return number;
                }
                counter ++;
                number --;
            }
        }
        return -1;
    }

    public static int getLargestPrimeTwo (int number){
        if (number < 2){
            return -1;
        }
        for (int i = 2; i < number; i ++){
            if ((number % i) == 0){
                number /= i;
                i --;
            }
        }
        return number;
    }

}
