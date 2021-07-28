package academy.learnprogramming;

import java.util.Scanner;

public class ArraryScanner {

    public static Scanner scanner = new Scanner(System.in);

    public static void runScanner (){
        int[] myIntegers = getInegers(5);
        for (int i = 0; i < myIntegers.length; i ++){
            System.out.println("element " + i + " data " + myIntegers[i]);
        }

        System.out.println("average " + getAverage(myIntegers));
    }

    private static int[] getInegers(int number) {
        System.out.println("Enter number " + number + "\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i ++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage (int[] array){
        int sumTotal =0;
        for (int i = 0; i < array.length; i ++){
            sumTotal += array[i];
        }
        return (double) sumTotal / (double)array.length;
    }

}
