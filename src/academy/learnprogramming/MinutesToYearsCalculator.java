package academy.learnprogramming;

public class MinutesToYearsCalculator {

    public static void printYearsAndDays (long minutes) {
        boolean isValidMinutes = minutes >= 0;

        if (isValidMinutes) {
            long hours = minutes / 60;
            long days = hours / 24;
            long daysLeftOver = days % 365;
            long years = days / 365;
            System.out.println(minutes + "min = " + years + " y and " + daysLeftOver + " d");
        } else {
            System.out.println("Invalid Value");
        }

    }

}
