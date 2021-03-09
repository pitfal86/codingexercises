package academy.learnprogramming;

public class NumberInWord {

    public static void numberInWord (int number) {
        String whatToPrint;
        switch (number) {
            case 0 :
                whatToPrint = "ZERO";
                break;
            case 1 :
                whatToPrint = "ONE";
                break;
            case 2 :
                whatToPrint = "TWO";
                break;
            case 3 :
                whatToPrint = "THREE";
                break;
            case 4 :
                whatToPrint = "FOUR";
                break;
            case 5 :
                whatToPrint = "FIVE";
                break;
            case 6 :
                whatToPrint = "SIX";
                break;
            case 7 :
                whatToPrint = "SEVEN";
                break;
            case 8 :
                whatToPrint = "EIGHT";
                break;
            case 9 :
                whatToPrint = "NINE";
                break;
            default:
                whatToPrint = "OTHER";
                break;
        }
        System.out.println(whatToPrint);

    }

}
