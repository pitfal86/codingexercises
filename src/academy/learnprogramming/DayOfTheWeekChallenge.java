package academy.learnprogramming;

public class DayOfTheWeekChallenge {

    public static void printDayOfTheWeek (int day){
        String dayOfWeek;

        switch (day) {
            case 0 :
                dayOfWeek = "Sunday";
                break;
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day";
                break;
        }
        System.out.println(dayOfWeek);

    }

}
