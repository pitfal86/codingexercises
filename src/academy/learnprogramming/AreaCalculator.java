package academy.learnprogramming;

public class AreaCalculator {

    public static double area (double radius){
        double areaCircle;
        boolean isValid = radius >= 0;

        if (isValid){
            areaCircle = radius * radius * Math.PI;
        } else {
            areaCircle = -1.0d;
        }

        return areaCircle;
    }

    public static double area (double x, double y){
        double areaRectangle;
        boolean isValidX = x >= 0;
        boolean isValidY = x >= 0;

        if (isValidX && isValidY){
            areaRectangle = x * y;
        } else {
            areaRectangle = -1.0d;
        }

        return areaRectangle;
    }

}
