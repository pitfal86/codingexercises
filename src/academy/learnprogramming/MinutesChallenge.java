package academy.learnprogramming;

public class MinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static double getDurationString (double minutes, double seconds){
        boolean isValidMinutes = (minutes >= 0);
        boolean isValidSeconds = (seconds >= 0 && seconds <= 59);

        if (isValidMinutes && isValidSeconds){
            double minutesFromSeconds = seconds / 60;
            return (minutesFromSeconds + minutes) / 60;
        } else {
            return -1d;
        }

    }

    public static double getDurationString (double seconds){
        boolean isValidSeconds = (seconds >= 0 && seconds <= 59);

        if ( isValidSeconds){
            double minutesFromSeconds = seconds / 60;
            return (minutesFromSeconds) / 60;
        } else {
            return -1d;
        }

    }

    public static String getDurationStringTwo (long minutes, long seconds) {
        if ((minutes < 0) || (seconds <0) || (seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    public static String getDurationStringTwo (long seconds) {
        if ( seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return  getDurationStringTwo(minutes, remainingSeconds);
    }

}
