package academy.learnprogramming;

public class LastDigitChecker {

    public static boolean hasSameLastDigit (int numberOne, int numberTwo, int numberThree){
        boolean isValidNumberOne = (numberOne >= 10 && numberOne <= 1000);
        boolean isValidNumberTwo = (numberTwo >= 10 && numberTwo <= 1000);
        boolean isValidNumberThree = (numberThree >= 10 && numberThree <= 1000);
        boolean sameLastDigit = false;

        if (isValidNumberOne && isValidNumberTwo && isValidNumberThree){
            int digitOne = numberOne % 10;
            int digitTwo = numberTwo % 10;
            int digitThree = numberThree % 10;

            System.out.println(digitOne);
            System.out.println(digitTwo);
            System.out.println( digitThree);

            if (digitOne == digitTwo || digitOne == digitThree || digitTwo == digitThree){
                sameLastDigit = true;
            }
        }
        System.out.println(sameLastDigit);
        return sameLastDigit;
    }


    public static boolean isValid (int number){
        boolean isValidNumber = (number >= 10 && number <= 1000);
        boolean valid = false;
        if (isValidNumber){
            valid = true;
        }
        return valid;
    }
}
