package academy.learnprogramming;

public class SpeedConverter {

    public static long toMilesPerHouse (double kilometersPerHour) {
        if (kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609d);
        }
    }

    public static void printConversion (double kilometersPerHouse){
        if (kilometersPerHouse < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHouse = toMilesPerHouse(kilometersPerHouse);
            System.out.println(kilometersPerHouse + " km/h = " + milesPerHouse + " mi/h");
        }

    }

}
