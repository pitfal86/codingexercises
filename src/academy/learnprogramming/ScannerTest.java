package academy.learnprogramming;

import java.util.Scanner;

public class ScannerTest {
    public static void minMaxChallenge(){
        Scanner scanner = new Scanner(System.in);

        //int minNum = 0;
       // int maxNum = 0;
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;
        boolean firstTime = true;

        while (true){
            System.out.println("enter number");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                if (number > maxNum || firstTime){
                    maxNum = number;
                }
                if (number < minNum || firstTime){
                    minNum = number;
                }
                firstTime = false;
            } else {
                System.out.println("Invalid");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min " + minNum + " max " + maxNum);
        scanner.close();
    }


    public static void getInputChallenge(){
        Scanner scanner = new Scanner(System.in);
        int numbersToCount = 10;
        int sumNumbers = 0;

        for (int i = 1; i <= numbersToCount; i ++){
            System.out.println("enter number " + i);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int numberInput = scanner.nextInt();
                sumNumbers += numberInput;
                scanner.nextLine();
            } else {
                System.out.println("Invalid Number");
                return;
            }
        }
        System.out.println(sumNumbers);
        scanner.close();
    }

    public static void getInputChallengeTwo(){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        // while (true)
        while (counter < 10){
            int order = counter + 1;
            System.out.println("enter number " + order);

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                counter ++;
                sum += number;
/*                if (counter == 10){
                    break;
                }*/
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }


    public static void getScanner (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter bday");
        boolean hasNextInt = scanner.hasNextInt(); // checks input qualifies (fixes type exceptions)
        if (hasNextInt){
            int bday = scanner.nextInt();

            scanner.nextLine(); // handles hitting Enter key

            System.out.println("enter name");
            String name = scanner.nextLine();
            int age = 2021 - bday;

            if (age >= 0 && age <= 100){
                System.out.println(name + " age " + age);
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Invalid input");
        }
        scanner.close();
    }
}
