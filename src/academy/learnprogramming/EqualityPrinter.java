package academy.learnprogramming;

public class EqualityPrinter {

    public static void printEqual (int numberOne, int numberTwo, int numberThree) {
        boolean isValidOne = numberOne >= 0;
        boolean isValidTwo = numberTwo >= 0;
        boolean isValidThree = numberThree >= 0;

        if (isValidOne && isValidTwo && isValidThree){
            // logic
            boolean isEqualAllOne = (numberOne == numberTwo || numberOne == numberThree);
            boolean isEqualAllTwo = (numberTwo == numberOne || numberTwo == numberThree);
            boolean isEqualAllThree = (numberThree == numberOne || numberThree == numberTwo);

            if (isEqualAllOne && isEqualAllTwo && isEqualAllThree){
                System.out.println("All numbers are equal");
            } else if (isEqualAllOne || isEqualAllTwo || isEqualAllThree) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }

        } else {
            System.out.println("Invalid Value");
        }


    }

}
