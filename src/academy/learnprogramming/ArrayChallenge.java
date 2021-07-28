package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {

    public static Scanner scanner = new Scanner(System.in);

    public static void runScanner (){
        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
    }


    private static int[] getIntegers(int number) {
        System.out.println("Enter number " + number + "\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i ++){
            values[i] = scanner.nextInt();
        }
        printArray(values);
        return values;
    }

    public static void printArray (int[] myIntegers){
        for (int i = 0; i < myIntegers.length; i ++){
            System.out.println("element " + i + " data " + myIntegers[i]);
        }
    }

    public static int[] sortIntegers (int[] myIntegers){
        int[] sortedArray = Arrays.copyOf(myIntegers, myIntegers.length);

        //int[] sortedArray = new int[myIntegers.length];
        //System.arraycopy(myIntegers, 0, sortedArray, 0, myIntegers.length);


        /*        for (int i = 0; i < myIntegers.length; i ++){
            sortedArray[i] = myIntegers[i];
        }*/


        boolean flag = true;
        int temp;

/*        // descending
        while(flag){
            flag = false;
            System.out.println("outter flag" + flag);
            for (int i = 0; i < sortedArray.length - 1; i ++){
                System.out.println("inner flag" + flag);
               if (sortedArray[i] < sortedArray[i + 1]){
                   temp = sortedArray[i];
                   sortedArray[i] = sortedArray [i + 1];
                   sortedArray[i + 1] = temp;
                   flag = true;
               }
            }
        }*/
        // ascending
        while(flag){
            flag = false;
            System.out.println("outter flag" + flag);
            for (int i = 0; i < sortedArray.length - 1; i ++){
                System.out.println("inner flag" + flag);
                if (sortedArray[i] > sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray [i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        // descending
/*        for (int i = 0; i < (myIntegers.length -1 ); i ++){
            for (int j = 0; j < (myIntegers.length - 1); j ++){
                if (myIntegers[j] < myIntegers[j +1]){
                    int temp = myIntegers[j];
                    myIntegers[j] = myIntegers[j + 1];
                    myIntegers[j + 1] = temp;
                }
            }
        }*/

        // ascending
/*         for (int i = 0; i < (myIntegers.length -1 ); i ++) {
             for (int j = 0; j < (myIntegers.length - 1); j++) {
                 if (myIntegers[j] > myIntegers[j + 1]) {
                     int temp = myIntegers[j];
                     myIntegers[j] = myIntegers[j + 1];
                     myIntegers[j + 1] = temp;
                 }
             }
         }*/

        //printArray(myIntegers);
        printArray(sortedArray);
        return sortedArray;
    }

}
