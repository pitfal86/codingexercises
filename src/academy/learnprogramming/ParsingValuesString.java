package academy.learnprogramming;

public class ParsingValuesString {

    public static void stringParse (){
        String numberAsString = "2018";
        System.out.println(numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println(number);
        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);



        String numberAsStringTwo = "2018.125";

        double numberTwo = Double.parseDouble(numberAsStringTwo);
        System.out.println(numberTwo);
    }
}
