package academy.learnprogramming;

public class SharedDigit {
    public static boolean hasSharedDigit (int numberOne, int numberTwo){
        boolean isValidNumberOne = (numberOne >= 10 && numberOne <= 99);
        boolean isValidNumberTwo = (numberTwo >= 10 && numberTwo <= 99);
        boolean digitShared = false;
        int numberTwoPrime = numberTwo;
        StringBuilder sharedNum = new StringBuilder();

        if (isValidNumberOne && isValidNumberTwo){
            while (numberOne > 0){
                int digit = numberOne % 10;
                System.out.println(digit);
                while (numberTwo > 0){
                    int digitTwo = numberTwo % 10;
                    System.out.println("compare dig one " + digit);
                    System.out.println("compare dig two " +digitTwo);
                    if (digit == digitTwo){
                        sharedNum.append(digit);
                        digitShared = true;
                    }
                    numberTwo /= 10;
                }
                numberTwo = numberTwoPrime;
                numberOne /= 10;
            }

        }
        System.out.println(sharedNum);
        System.out.println(digitShared);
        return digitShared;
    }

}
