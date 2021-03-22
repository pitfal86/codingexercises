package academy.learnprogramming;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHouse(100d);
        //System.out.println(miles);
        //SpeedConverter.printConversion(100d);

        //MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        //System.out.println(BarkingDog.shouldWakeUp(true, 0));

        //System.out.println(LeapYear.isLeapYear(2000));

        //System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));

        //System.out.println(EqualSumChecker.hasEqualSUm(1, -1, 0));

        //System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));

        //OverLoading.calculateScore("bob" , 1000);
        //OverLoading.calculateScore(1000);
        //OverLoading.calculateScore();

        //System.out.println(OverLoading.calcFeetAndInchesToCentimeters(11));
        //System.out.println(OverLoading.calcFeetAndInchesToCentimeters(0,  1));
        //System.out.println(OverLoading.calcFeetAndInchesToCentimeters(23));
        //System.out.println(OverLoading.calcFeetAndInchesToCentimeters(-5,  23));

        //System.out.println(MinutesChallenge.getDurationString(59, 59));
        //System.out.println(MinutesChallenge.getDurationString(59));

        //System.out.println(MinutesChallenge.getDurationStringTwo(65, 45));
        //System.out.println(MinutesChallenge.getDurationStringTwo(3945));

        //System.out.println(AreaCalculator.area(-1d));
        //System.out.println(AreaCalculator.area(5.0d));
        //System.out.println(AreaCalculator.area(5.0d, 4.0d));
        //System.out.println(AreaCalculator.area(-1d, 4.0d));

        //MinutesToYearsCalculator.printYearsAndDays(525600);
        //MinutesToYearsCalculator.printYearsAndDays(1051200);
        //MinutesToYearsCalculator.printYearsAndDays(561600);

        //EqualityPrinter.printEqual(1, 1, 1);


        //System.out.println(PlayingCat.isPlayingCat(false, 35));

        //Switch.testSwitch();
        //Switch.switchChalleng();
        //DayOfTheWeekChallenge.printDayOfTheWeek(0);

        //System.out.println(NumberOfDaysInMonth.isLeapYear(-1600));
        //System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
       // System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
       // System.out.println(NumberOfDaysInMonth.isLeapYear(2000));

       // System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
       // System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
       // System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        //System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        //System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));

        //System.out.println(ForLoop.calCalculateInterest(10000, 7.0));
    /*
    for (int i = 2; i < 8; i++){
        // format of string to only do 2 decimals (fixed 700.00001)
        System.out.println(String.format("%.2f",ForLoop.calCalculateInterest(10000, i)));
    }
    for (int i = 8; i >= 2 ; i--){
        // format of string to only do 2 decimals (fixed 700.00001)
        System.out.println(String.format("%.2f",ForLoop.calCalculateInterest(10000, i)));
    }*/

        //PrimeCHeck.checkNumber();

        //SumChallenge.sumAllNumbers();

/*        System.out.println(SumOddRange.sumOdd(1, 100));
        System.out.println(SumOddRange.sumOdd(-1, 100));
        System.out.println(SumOddRange.sumOdd(100, 100));
        System.out.println(SumOddRange.sumOdd(13, 13));
        System.out.println(SumOddRange.sumOdd(100, -100));
        System.out.println(SumOddRange.sumOdd(100, 1000));*/

        ///WhileLoop.whileLoops();
        //System.out.println(WhileLoop.isEvenNumber(23));


/*        DigitSumChallenge.sumDigits(-125);
        DigitSumChallenge.sumDigits(4);
        DigitSumChallenge.sumDigits(125);
        DigitSumChallenge.sumDigits(32123);*/

        //NumberPalindrome.isPalindrome(-1221);
       // NumberPalindrome.isPalindrome(707);
       // NumberPalindrome.isPalindrome(11212);

       // FirstLastDigitSum.sumFirstAndLastDigit(252);
      //  FirstLastDigitSum.sumFirstAndLastDigit(257);
      //  FirstLastDigitSum.sumFirstAndLastDigit(0);
      //  FirstLastDigitSum.sumFirstAndLastDigit(5);
       // FirstLastDigitSum.sumFirstAndLastDigit(-10);
       // FirstLastDigitSum.sumFirstAndLastDigit(11);

      //  EvenDigitSum.getEvenDigitSum(123456789);
      //  EvenDigitSum.getEvenDigitSum(252);
      //  EvenDigitSum.getEvenDigitSum(-22);

        //SharedDigit.hasSharedDigit(12, 13);
       // SharedDigit.hasSharedDigit(9, 99);
      //  SharedDigit.hasSharedDigit(15, 55);
       // SharedDigit.hasSharedDigit(23, 55);

      //  LastDigitChecker.hasSameLastDigit(41, 22, 71);
      //  LastDigitChecker.hasSameLastDigit(23, 32, 42);
      // LastDigitChecker.hasSameLastDigit(9, 99, 999);

      //  GreatestCommonDivisor.getGreatestCommonDivisor(12, 30);

       // FactorPrinter.printFactors(10);

        //PerfectNumber.isPerfectNumber(6);
       // PerfectNumber.isPerfectNumber(0);



/*        NumberToWords.numberToWords(123);
        NumberToWords.numberToWords(1010);
        NumberToWords.numberToWords(1000);
        NumberToWords.numberToWords(-12);

        System.out.println(NumberToWords.reverse(-121));
        System.out.println(NumberToWords.reverse(1212));
        System.out.println(NumberToWords.reverse(1234));
        System.out.println(NumberToWords.reverse(1));

        System.out.println(NumberToWords.getDigitCount(0));
        System.out.println(NumberToWords.getDigitCount(123));
        System.out.println(NumberToWords.getDigitCount(-12));
        System.out.println(NumberToWords.getDigitCount(5200));*/

       // ParsingValuesString.stringParse();


      /*  System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 1, 12));
        System.out.println(FlourPacker.canPack(1, 0, 6));*/

/*        System.out.println(LargestPrime.getLargestPrime(21));
        System.out.println(LargestPrime.getLargestPrime(217));
        System.out.println(LargestPrime.getLargestPrime(0));
        System.out.println(LargestPrime.getLargestPrime(45));
        System.out.println(LargestPrime.getLargestPrime(-1));

        System.out.println(LargestPrime.getLargestPrimeTwo(21));
        System.out.println(LargestPrime.getLargestPrimeTwo(217));
        System.out.println(LargestPrime.getLargestPrimeTwo(0));
        System.out.println(LargestPrime.getLargestPrimeTwo(45));
        System.out.println(LargestPrime.getLargestPrimeTwo(-1));*/

       // DiagonalStar.printSquareStar(8);

       // ScannerTest.getScanner();

       // ScannerTest.getInputChallenge();

       // ScannerTest.minMaxChallenge();

       // InputCalculator.inputThenPrintSumAndAverage();

        //System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2));
        //System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        //System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1));
        //System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5));
       // System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5 ));
       // System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
        //System.out.println(PaintJob.getBucketCount(3.4, 1.5));
        //System.out.println(PaintJob.getBucketCount(6.26, 2.2));
       // System.out.println(PaintJob.getBucketCount(3.26, 0.75));

/*        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());*/


/*        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(10);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(100);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(90);
        System.out.println(bankAccount.getBalance());*/


       // BankAccount bankAccountTwo = new BankAccount(123, 100, "bob", "bob@bob", "888-888");
       // System.out.println(bankAccountTwo.getBalance());

/*        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);

        System.out.println(calculator.getTotalCost());

        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);

        System.out.println(calculator.getTotalCost());*/

/*        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        one.subtract(number);
        System.out.println(one.getReal());
        System.out.println(one.getImaginary());
        number.subtract(one);
        System.out.println(number.getReal());
        System.out.println(number.getImaginary());*/

        //Animal animal = new Animal("Animal", 1, 1, 5, 5);
       // Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long");
       // dog.eat();
       // dog.walk();
        //dog.run();


/*        Dodge dodge = new Dodge(36);
        dodge.steer(45);
        dodge.accelerate(30);
        dodge.accelerate(20);
        dodge.accelerate(-42);*/


/*        Circle circle = new Circle(3.75);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());*/


        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println(cuboid.getWidth());
        System.out.println(cuboid.getLength());
        System.out.println(cuboid.getArea());
        System.out.println(cuboid.getHeight());
        System.out.println(cuboid.getVolume());

    }



}
