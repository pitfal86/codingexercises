package academy.learnprogramming;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sumOfAll = 0;
        double averageOfAll = 0;
        int countOfAll = 0;

        while (scanner.hasNextInt()){
            sumOfAll += scanner.nextInt();
            countOfAll ++;
            scanner.nextLine();
        }



/*        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int userInput = scanner.nextInt();
                countOfAll ++;
                sumOfAll += userInput;
                averageOfAll = sumOfAll / countOfAll;
                scanner.nextLine();
            } else {
                break;
            }
        }*/
        averageOfAll = Math.round((double) sumOfAll / countOfAll);

        System.out.println("SUM = " + sumOfAll + " AVG = " + averageOfAll);

        scanner.close();
    }

}
