package academy.learnprogramming;

public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal){
        boolean isValidBc = (bigCount >= 0);
        boolean isValidSc = (smallCount >= 0);
        boolean isValidG = (goal >= 0);

        if (isValidBc && isValidG && isValidSc){
            int bigCountW = bigCount * 5;
            int sumALl = bigCountW + smallCount;
            if (sumALl < goal){
                return false;
            } else{
                return goal % 5 <= smallCount;
            }
        } else {
            return false;
        }
    }

}
