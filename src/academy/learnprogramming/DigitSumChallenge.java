package academy.learnprogramming;

public class DigitSumChallenge {

    public static int sumDigits (int number) {
        boolean isValidNumber = (number >= 10);
        if (isValidNumber){
            int numberSum = 0;
            // 125 -> 125 / 10 -> 12 * 10 -> 125 - 120 = 5
            while (number > 0){
                // extract last digit
                int digit = number % 10;
                // add to total
                numberSum += digit;
                // drop last digit
                number /= 10;
            }
            System.out.println(numberSum);
            return numberSum;
        } else {
            System.out.println(-1);
            return -1;
        }

    }

}
