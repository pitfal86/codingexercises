package academy.learnprogramming;

public class OverLoading {

    public static int calculateScore (String name, int score){
        System.out.println("Player" + name + score);
        return score * 1000;
    }

    public static int calculateScore (int score){
        System.out.println( score);
        return score * 1000;
    }

    public static int calculateScore (){
        System.out.println("Player" );
        return  1000;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        boolean isValidFeet = (feet >= 0);
        boolean isValidInches = (inches >= 0 && inches <=12);

        double centimetersFeet;
        double centimetersInches;

        if (isValidFeet && isValidInches){
           centimetersFeet = feet * 30.48d;
           centimetersInches = inches * 2.54d;
            return centimetersFeet + centimetersInches;
        }
        else {
            return -1d;
        }

    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        boolean isValidInches = (inches >= 0 && inches <=12);

        double centimetersInches;

        if (isValidInches){
            centimetersInches = inches * 2.54d;
            return  centimetersInches;
        } else {
            return -1d;
        }

    }

}
