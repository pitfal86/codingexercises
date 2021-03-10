package academy.learnprogramming;

public class PaintJob {

    public static int getBucketCount (double width, double height, double arePerBucket, int extraBuckets){
        boolean validWidth = (width > 0);
        boolean validHeight = (height > 0);
        boolean validArea = (arePerBucket > 0);
        boolean validBuckets = (extraBuckets >= 0);

        if (validWidth && validHeight && validArea && validBuckets){
            double areaCalc = Math.ceil(((width * height) / arePerBucket) - extraBuckets);
            return (int) areaCalc;
        } else {
            return -1;
        }
    }

    public static int getBucketCount (double width, double height, double arePerBucket){
        boolean validWidth = (width > 0);
        boolean validHeight = (height > 0);
        boolean validArea = (arePerBucket > 0);

        if (validWidth && validHeight && validArea){
            double areaCalc = Math.ceil(((width * height) / arePerBucket));
            return (int) areaCalc;
        } else {
            return -1;
        }
    }

    public static int getBucketCount (double area, double arePerBucket){
        boolean validArea = (area > 0);
        boolean validAreaBucket = (arePerBucket > 0);

        if (validArea && validAreaBucket){
            double areaCalc = Math.ceil(((area) / arePerBucket));
            return (int) areaCalc;
        } else {
            return -1;
        }
    }

}
