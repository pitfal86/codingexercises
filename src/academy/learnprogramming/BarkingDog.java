package academy.learnprogramming;

public class BarkingDog {

    public static boolean shouldWakeUp (boolean isBarking, int hourOfDay) {
        boolean wakeUp = false;
        if (hourOfDay <=23 && hourOfDay >= 0 && isBarking){
            if (hourOfDay < 8 || hourOfDay > 22){
                wakeUp = true;
            }
        }
        return wakeUp;
    }
}
