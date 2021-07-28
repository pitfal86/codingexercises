package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] readIntegers(){

        System.out.println("Enter amount ");
        int number = scanner.nextInt();
        int[] values = new int[number];

        for (int i = 0; i < values.length; i ++){
            System.out.println("Enter number " + (i + 1));
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println(Arrays.toString(findMin(values)));
        System.out.println(findMin(values)[0]);
        System.out.println(findMinAnswer(values));
        System.out.println(Arrays.toString(swapArray(values)));
        scanner.close();
        return values;

    }

    private static int[] findMin(int[] arrayVal){
        for (int i = 0; i < arrayVal.length -1; i ++){
            for (int j = 0; j < arrayVal.length -1; j++){
                if (arrayVal[j] > arrayVal[j + 1]){
                    int temp = arrayVal[j];
                    arrayVal[j] = arrayVal[j + 1];
                    arrayVal[j + 1] = temp;
                }
            }
        }
        return arrayVal;
    }

    private static int findMinAnswer(int[] arrayVal){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arrayVal.length; i ++){
            if(arrayVal[i] < min){
                min = arrayVal[i];
            }
        }
        return min;
    }

    private static int[] swapArray (int[] arraySwap){
        int[] tempArray = Arrays.copyOf(arraySwap, arraySwap.length);

        for (int i = 0; i < arraySwap.length /2; i ++){
            int temp = tempArray[arraySwap.length - i -1];
            tempArray[arraySwap.length - i -1] = arraySwap[i];
            tempArray[i] = temp;
        }
        return tempArray;
    }

    private static void reversAnswer (int[] arry){
        int maxIndex = arry.length -1;
        int halfLength = arry.length /2;

        for (int i = 0; i < halfLength; i ++){
            int temp = arry[i];
            arry[i] = arry[maxIndex - i];
            arry[maxIndex - i] = temp;
        }
    }
}
