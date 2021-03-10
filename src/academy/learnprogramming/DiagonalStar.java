package academy.learnprogramming;

public class DiagonalStar {

    public static void printSquareStar (int number){
        boolean isValidNum = (number >= 5);
        if (isValidNum){
            for (int  i = 0; i < number; i ++){
                StringBuilder row = new StringBuilder(number);
                for (int j = 0; j < number; j ++){
                    if (i == 0 || i == number - 1){
                        // print stars for first or last row
                        row.append("*");
                    } else if (j == 0 || j == number -1) {
                        // print stars for first or last column
                        row.append("*");
                    } else if (j == i){
                        // print stars when row equals column
                        row.append("*");
                    } else if (j == number - 1 - i){
                        // print stars when column equals (rowcount - 1 - current row)
                        row.append("*");
                    }
                    else {
                        row.append(" ");
                    }
                }
                System.out.println(row);
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

}
