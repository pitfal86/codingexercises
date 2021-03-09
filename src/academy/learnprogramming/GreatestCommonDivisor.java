package academy.learnprogramming;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second){
        boolean isValidFirst = (first >= 10);
        boolean isValidSecond = (second >= 10);
        int primeFirst = first;
        int primeSecond = second;
        int gCd = 0;

        if (isValidFirst && isValidSecond){
            while (first > 0){
                int divisorOne = primeFirst % first;
                if (divisorOne == 0){
                    System.out.println("loop one " + primeFirst + " - " + first + " - " + divisorOne);
                    while (second > 0){
                        int divisorTwo = primeSecond % second;
                        System.out.println("loop two " + primeSecond + " - " + second + " - " + divisorTwo);
                        if (divisorTwo == 0 && first == second){
                            System.out.println(first + " equals " + second);
                            System.out.println(gCd + " gcd found ");
                            gCd = first;
                            break;
                        }
                        second --;
                    }
                }
                if (gCd > 0){
                    break;
                }
                second = primeSecond;
                first --;
            }
        }
        return gCd;
    }

}
