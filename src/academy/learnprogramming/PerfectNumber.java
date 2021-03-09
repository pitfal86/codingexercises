package academy.learnprogramming;

public class PerfectNumber {
    public static boolean isPerfectNumber (int number){
        boolean isValidNumber = (number >= 1);
        boolean isPerfect = false;
        int primeNumber = number;
        int sumDivisors = 0;

        if (isValidNumber){
            while (number > 0){
                int divisor = primeNumber % number;
                if (divisor == 0 && number != primeNumber){
                    System.out.println(sumDivisors + "-" + number);
                    sumDivisors += number;
                }
                number --;
            }
            if (sumDivisors == primeNumber){
                isPerfect = true;
            }
        }

        System.out.println(sumDivisors + " - " + primeNumber);
        System.out.println(isPerfect);
        return isPerfect;
    }

}
