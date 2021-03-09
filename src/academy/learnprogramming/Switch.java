package academy.learnprogramming;

import java.util.Locale;

public class Switch {

    public static void testSwitch (){

        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3, 4, 5");
                System.out.println("was " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

    }


    public static void switchChalleng (){
        char myValue = 'a';

        switch (myValue){
            case 'A' : case 'B' : case 'C' : case 'D' : case 'E' :
                System.out.println("Values were found " + myValue);
                break;
            default:
                System.out.println("not found " + myValue);
                break;
        }

        String myString = "june";

        switch (myString.toUpperCase()) {
            case "JANUARY" :
                System.out.println("Jan");
                break;
            case "JUNE" :
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }


    }

}
