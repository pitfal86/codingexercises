package academy.learnprogramming;

public class FactorPrinter {

    public static void printFactors (int number){
        boolean isValidNumber = (number >= 1);
        int numberPrime = number;
        int counter = 1;
        StringBuilder output = new StringBuilder();

        if (isValidNumber){
            while (number > 0){
                int divisor = numberPrime % counter;
                if (divisor == 0){
                    output.append(counter);
                    output.append(" ");
                }
                counter ++;
                number --;
            }
            System.out.println(output);
        } else {
            System.out.println("Invalid Value");
        }

    }

}
