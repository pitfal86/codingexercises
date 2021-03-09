package academy.learnprogramming;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear (int year){
        boolean isValidYear = (year >= 1 && year <= 9999);

        if (isValidYear){
            if (year % 4 != 0){
                return false;
            } else if (year % 400 == 0){
                return true;
            } else if (year % 100 == 0){
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth (int month, int year){
        boolean isValidMonth = (month <= 12 && month >= 1);
        boolean isValidYear = (year >= 1 && year <= 9999);

        if (isValidMonth && isValidYear){
            switch (month) {
                case 1 : case 3 : case 5 : case 7 : case 8 :  case 10 : case 12 :
                    return 31;
                case 2 :
                    if (isLeapYear(year)){
                        return 29;
                    } else {
                        return 28;
                    }
                case 4 : case 9 : case 6 : case 11 :
                    return 30;
                default:
                    return -1;
            }
        } else {
            return -1;
        }

    }

}
