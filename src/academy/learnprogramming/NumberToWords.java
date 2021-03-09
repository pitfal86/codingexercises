package academy.learnprogramming;

public class NumberToWords {

    public static void numberToWords (int number){
        boolean isValidNumber = (number >= 0);
        int primeNumber = number;
        StringBuilder outputWords = new StringBuilder();
        StringBuilder outputNumbers = new StringBuilder();

        if (isValidNumber){
            while (number > 0){
                int digit = number % 10;
                outputNumbers.append(digit);
                number /= 10;
            }
            int outputNumberInt = Integer.parseInt(outputNumbers.toString());
            int reversedNum = reverse(outputNumberInt);
            StringBuilder reversedOutput = new StringBuilder();
            reversedOutput.append(reversedNum);
            if (getDigitCount(primeNumber) != getDigitCount(reversedNum)){
                for (int i = 0; i < getDigitCount(primeNumber) - getDigitCount(reversedNum) ; i ++){
                    reversedOutput.append("0");
                }
            }
            int reversedOutputInt = Integer.parseInt(outputNumbers.toString());
            while (reversedOutputInt > 0){
                int digit = reversedOutputInt % 10;
                outputNumbers.append(digit);
                switch (digit){
                    case 0 :
                        outputWords.append("Zero").append(" ");
                        break;
                    case 1 :
                        outputWords.append("One").append(" ");
                        break;
                    case 2 :
                        outputWords.append("Two").append(" ");
                        break;
                    case 3 :
                        outputWords.append("Three").append(" ");
                        break;
                    case 4 :
                        outputWords.append("Four").append(" ");
                        break;
                    case 5 :
                        outputWords.append("Five").append(" ");
                        break;
                    case 6 :
                        outputWords.append("Six").append(" ");
                        break;
                    case 7 :
                        outputWords.append("Seven").append(" ");
                        break;
                    case 8 :
                        outputWords.append("Eight").append(" ");
                        break;
                    case 9 :
                        outputWords.append("Nine").append(" ");
                        break;
                    default:
                        break;
                }
                reversedOutputInt /= 10;
            }
            if (getDigitCount(primeNumber) != getDigitCount(reversedNum)){
                for (int i = 0; i < getDigitCount(primeNumber) - getDigitCount(reversedNum) ; i ++){
                    outputWords.append("Zero").append(" ");
                }
            }
            System.out.println(reversedOutput);
            System.out.println(outputWords);
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse (int number){
        boolean isNeg = (number * -1 > 0);
        if (isNeg){
            number *= -1;
        }
        StringBuilder reverseString = new StringBuilder();
        while (number > 0){
            int digit = number % 10;
            reverseString.append(digit);
            number /= 10;
        }
        if (isNeg){
            reverseString.insert(0, "-");
        }
        return Integer.parseInt(reverseString.toString());
    }

    public static int getDigitCount (int number){
        boolean isValidNumber = (number >= 0);
        int digCount = 0;
        if (isValidNumber){
            while (number > 0){
                digCount ++;
                number /= 10;
            }
            if (digCount == 0){
                digCount += 1;
            }
        } else {
            digCount = -1;
        }
        return digCount;
    }


}
