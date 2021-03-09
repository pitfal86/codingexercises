package academy.learnprogramming;

public class WhileLoop {

    public static void whileLoops (){
        int count = 1;

        while (count != 6) {
            System.out.println("count " + count);
            count++;
        }

        count = 1;
        while (true){
            if (count == 6){
                break;
            } else {
                System.out.println("counting " + count);
                count ++;
            }
        }

        count = 6;
        do {
            System.out.println("counting fun " + count);
            count ++;

            if (count > 10){
                break;
            }

        } while (count != 6);

        int number = 4;
        int finishNumber = 20;
        int countWhile = 0;

        while (number <= finishNumber){
            number ++;
            if (!isEvenNumber(number)){
                // goes back up to while and skips below
                continue;
            }
            System.out.println("even number " + number);

            countWhile ++;
            if (countWhile >= 5){
                // exits while
                break;
            }
        }
        System.out.println("total: " + countWhile);
    }



    public static boolean isEvenNumber (int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }

    }


}
