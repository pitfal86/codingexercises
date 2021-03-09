package academy.learnprogramming;

public class SumChallenge {

    public static void sumAllNumbers (){

        int sumTotal = 0;
        int countNums = 0;

        for (int i = 1; i <= 1000; i ++){
            if (i % 3 == 0){
                System.out.println(i + " divides by 3");
                sumTotal += i;
                countNums ++;
            }
            if (i % 5 == 0){
                System.out.println(i + " divides by 5");
                sumTotal += i;
                countNums ++;
            }

/*            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println(i + " divides by 5 or 3");
                sumTotal += i;
                countNums ++;
            }*/

            if (countNums == 5){
                break;
            }
        }
        System.out.println("total amount: " + sumTotal);
        System.out.println("total count: " + countNums);
    }

}
