package academy.learnprogramming;

public class PrimeCHeck {

    public static void checkNumber (){
        int j = 0;
        for (int i = 10; i < 50; i ++){
            if (isPrime(i)){
                System.out.println(i + " is prime");
                j++;
                if (j == 10){
                    break;
                }
            }
        }
    }


    public static boolean isPrime (int n){
        if (n == 1){
            return false;
        }
        // < n
        // <= n /2
        // <= (long) Math.sqrt(n)
        System.out.println(Math.sqrt(n));
        for (int i = 2; i <= (long) Math.sqrt(n); i ++){
            System.out.println("loop" + i);
            if (n % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
