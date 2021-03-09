package academy.learnprogramming;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number){
        int numberPrime = number;
        int sumOfDigits = 0;
        int counter = 0;
        int length = String.valueOf(number).length();

        boolean isValidNumber = (number * -1 <= 0);

        if (isValidNumber){
            while (number > 0){
                int digit = number % 10;
                if (counter == 0 || counter == length -1){
                    sumOfDigits += digit;
                }
                counter ++;
                number /= 10;
            }
            if (sumOfDigits == numberPrime){
                sumOfDigits *= 2;
            }
        } else {
            sumOfDigits = -1;
        }
        System.out.println(sumOfDigits);
        return sumOfDigits;
    }

}
