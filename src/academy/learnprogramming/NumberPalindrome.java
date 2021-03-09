package academy.learnprogramming;

public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        boolean numberIsPal = false;
        boolean isNegative = (number * -1 > 0);
        int numberPrime = number;
        StringBuilder numberCounter = new StringBuilder();

        if (isNegative){
            number *= -1;
        }

        while (number > 0){
            // extract last digit
            int digit = number % 10;
            // add to total
            numberCounter.append(digit);
            // drop last digit
            number /= 10;
        }

        if (isNegative){
            numberCounter.insert(0, '-');
        }

        if (Integer.toString(numberPrime).equals(numberCounter.toString())){
            numberIsPal = true;
        }
        return numberIsPal;
    }

}
