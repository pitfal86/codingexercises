package academy.learnprogramming;

import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

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


/*        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println(cuboid.getWidth());
        System.out.println(cuboid.getLength());
        System.out.println(cuboid.getArea());
        System.out.println(cuboid.getHeight());
        System.out.println(cuboid.getVolume());*/

        //Case myCase = new Case("220b", "dell", "240", new Dimensions(20, 20, 5));
        //Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        //Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        //PC thePC = new PC(myCase, monitor, motherboard);
        //thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        //thePC.getMotherboard().loadProgram("Windows 1.0");
        //thePC.getTheCase().pressPowerButton();
        //thePC.powerUp();

/*
        WallChallenge wall1 = new WallChallenge("West");
        WallChallenge wall2 = new WallChallenge("South");
        WallChallenge wall3 = new WallChallenge("North");
        WallChallenge wall4 = new WallChallenge("East");
        Ceiling ceiling = new Ceiling(12, 55);
        Bed bed = new Bed("Modern", 4, 3, 2, 1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();*/

/*        Player player = new Player();
        player.fullName = "tim";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.lostHealth(damage);
        System.out.println(player.health);

        damage = 11;
        player.health = 200;
        player.lostHealth(damage);
        System.out.println(player.health);*/

/*        PlayerEnhanced playerEnhanced = new PlayerEnhanced("time", 50, "sword");
        System.out.println(playerEnhanced.getHealth());
        playerEnhanced.lostHealth(30);
        System.out.println(playerEnhanced.getHealth());*/

/*        Printer printer = new Printer(50, false);
        int pagesPrinted = printer.printPages(4);
        System.out.println(printer.getPagesPrinted());
        System.out.println("sedcond" + pagesPrinted);
        pagesPrinted = printer.printPages(2);
        System.out.println(printer.getPagesPrinted());
        System.out.println("sedcond" + pagesPrinted);*/

/*        for (int i = 1; i < 11; i ++){
         Movie movie = Polymorphism.randomMovie();
            System.out.println("movie " + i + "\n" + movie.getName() + "\n" + movie.plot());
        }*/

/*        for (int i = 1; i < 11; i ++){
            PolyCar car = PolyTwo.randomCar();
            System.out.println("car " + i + "\n" + car.getName() + "  " + car.startEngine());
        }*/



/*        PolyCar polyCar = new PolyCar("Base Case", 8);
        System.out.println(polyCar.startEngine());
        System.out.println(polyCar.accelerate());
        System.out.println(polyCar.brake());

        Toyota toyota = new Toyota("Corolla", 12);
        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.brake());

        Audi audi = new Audi("TT", 16);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());*/

       /* Hamburger hamburger = new Hamburger("wheat roll", "Elk", 9.99, "The Rachel");
        System.out.println(hamburger.toString());
        hamburger.hasCarrot(true);
        System.out.println(hamburger.toString());
        hamburger.hasCarrot(false);
        System.out.println(hamburger.toString());
        hamburger.hasLettuce(true);
        hamburger.hasTomato(true);
        System.out.println(hamburger.toString());
        hamburger.hasTomato(false);
        System.out.println(hamburger.toString());

        HamburgerHealthy hamburgerHealthy = new HamburgerHealthy( "Bison", 9.99, "The Joey");
        System.out.println(hamburgerHealthy.toString());
        hamburgerHealthy.hasCarrot(true);
        System.out.println(hamburgerHealthy.toString());
        hamburgerHealthy.hasCarrot(false);
        System.out.println(hamburgerHealthy.toString());
        hamburgerHealthy.hasLettuce(true);
        hamburgerHealthy.hasTomato(true);
        System.out.println(hamburgerHealthy.toString());
        hamburgerHealthy.hasTomato(false);
        System.out.println(hamburgerHealthy.toString());
        hamburgerHealthy.hasExtraLettuce(true);
        System.out.println(hamburgerHealthy.toString());


        HamburgerDeluxe hamburgerDeluxe = new HamburgerDeluxe( "white", "Bison", 9.99, "The Ross");
        System.out.println(hamburgerDeluxe.toString());
        hamburgerDeluxe.hasCarrot(true);
        System.out.println(hamburgerDeluxe.toString());
        hamburgerDeluxe.hasCarrot(false);
        System.out.println(hamburgerDeluxe.toString());
        hamburgerDeluxe.hasLettuce(true);
        hamburgerDeluxe.hasTomato(true);
        System.out.println(hamburgerDeluxe.toString());
        hamburgerDeluxe.hasTomato(false);
        System.out.println(hamburgerDeluxe.toString());*/


   /*     HamburgerAnswer hamburgerAnswer = new HamburgerAnswer("Basic" , "Sausage" , 3.56, "white");
        double price = hamburgerAnswer.itemizeHamburger();
        hamburgerAnswer.addHamburgerAddition1("Tomato", .27);
        hamburgerAnswer.addHamburgerAddition2("Lettuce", .75);
        hamburgerAnswer.addHamburgerAddition3("Cheese", 1.13);
        price = hamburgerAnswer.itemizeHamburger();
        System.out.println(price);

        HealthyBurgerAnswer healthyBurgerAnswer = new HealthyBurgerAnswer("Bacon", 5.67);
        healthyBurgerAnswer.addHamburgerAddition1("Egg", 5.43);
        healthyBurgerAnswer.addHealthAddition1("Lentils", 3.41);
        System.out.println(healthyBurgerAnswer.itemizeHamburger());

        HamburgerDeluxeAnswer hamburgerDeluxeAnswer = new HamburgerDeluxeAnswer();
        hamburgerDeluxeAnswer.addHamburgerAddition1("no", 100.00);
        hamburgerDeluxeAnswer.itemizeHamburger();*/


/*        int[] myIntArr = new int[10];
        myIntArr[5] = 50;
        int[] myIntArrTwo = {1,2,3,4,5,6,7,8,9,10};
        int[] myIntArrThree = new int[10];
        for (int i =0; i < myIntArrThree.length; i ++){
            myIntArrThree[i] = i *10;
        }
        for (int i =0; i < myIntArrThree.length; i ++){
            System.out.println(myIntArrThree[i]);
        }*/

        //ArraryScanner.runScanner();

       // ArrayChallenge.runScanner();

      //  ArrayElementChallenge.readIntegers();

       // ArrayListGroceryMain arrayListGroceryMain = new ArrayListGroceryMain();
      //  arrayListGroceryMain.scannerThing();

     //   ArrayListMobilePhone arrayListMobilePhone = new ArrayListMobilePhone();
      //  arrayListMobilePhone.printMenu();

      //  ArrayListMobilePhoneSol arrayListMobilePhoneSol = new ArrayListMobilePhoneSol("123122312");
      //  arrayListMobilePhoneSol.runApp();

/*        Solution solution = new Solution();
        long[] myIntArray = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        System.out.println(solution.indexes(myIntArray, 1231).first);
        System.out.println(solution.indexes(myIntArray, 1231).second);*/

/*        Bank bank = new Bank("Cool Bank");
        bank.addBranch("Best Branch");
        bank.addCustomer("Best Branch", "Awesome Customer", 20.01);
        bank.addCustTransaction("Best Branch", "Awesome Customer", 40.05);

        bank.listCustomer("Best Branch", true);

        if (!bank.addCustomer("Blarg", "Bob", 5.56)){
            System.out.println("Branch doesn't exist");
        }

        if (!bank.addBranch("Best Branch")){
            System.out.println("Branch exists");
        }

        if (!bank.addCustTransaction("Best Branch", "Frank", 30.33)){
            System.out.println("Customer doesn't exists");
        }

        test this is a  test of the testing thing that neeeds to test
        if (!bank.addCustomer("Best Branch", "Awesome Customer", 30.33)){
            System.out.println("Customer already exists");
        }*/

/*
        LinkedList linkedList = new LinkedList("Tim", 54.96);
        LinkedList anotherLinkedList;

        anotherLinkedList = linkedList;
        anotherLinkedList.setBalance(12.19);
        System.out.println(linkedList.getName() + " " + linkedList.getBalance());
*/

/*        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);

        for (int i = 0; i < list.size(); i++){
            System.out.println(i + " " + list.get(i));
        }

        list.add(1,2);

        for (int i = 0; i < list.size(); i++){
            System.out.println(i + " " + list.get(i));
        }*/

        BinaryNode a = new BinaryNode('a');
        BinaryNode b = new BinaryNode('b');
        BinaryNode c = new BinaryNode('c');
        BinaryNode d = new BinaryNode('d');
        BinaryNode e = new BinaryNode('e');
        BinaryNode f = new BinaryNode('f');

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        BinaryDepthFirst binaryDepthFirst = new BinaryDepthFirst(a);
        Stack<BinaryNode> result = binaryDepthFirst.performSearch();
        for (BinaryNode binaryNode : result) {
           // System.out.println(binaryNode.value);
        }

        BinaryDepthFirst binaryDepthFirst1 = new BinaryDepthFirst(null);
        Stack<BinaryNode> result2 = binaryDepthFirst1.performSearch();
        for (BinaryNode binaryNode : result2) {
           // System.out.println(binaryNode.value);
        }

        Stack<BinaryNode> result3 = binaryDepthFirst.searchRecursive(a);
        for (BinaryNode binaryNode : result3) {
           // System.out.println(binaryNode.value);
        }

        BinaryBreadthFirst binaryBreadthFirst = new BinaryBreadthFirst(a);
        Queue<BinaryNode> result4 = binaryBreadthFirst.performSearch();
        for (BinaryNode binaryNode : result4) {
            //System.out.println(binaryNode.value);
        }

        BinaryBreadthFirst binaryBreadthFirst1 = new BinaryBreadthFirst((BinaryNode) null);
        Queue<BinaryNode> result5 = binaryBreadthFirst.performSearch();
        for (BinaryNode binaryNode : result5) {
            //System.out.println(binaryNode.value);
        }

        BinaryBreadthFirst binaryBreadthFirs2 = new BinaryBreadthFirst(a);
        boolean result6 = binaryBreadthFirs2.searchValue('e');
        //System.out.println(result6);

        BinaryBreadthFirst binaryBreadthFirst3 = new BinaryBreadthFirst((BinaryNode) null);
        boolean result7 = binaryBreadthFirst3.searchValue('e');
        //System.out.println(result7);



        boolean result8 = binaryDepthFirst.searchValue(a, 'e');
        //System.out.println(result8);

        boolean result9 = binaryDepthFirst.searchValue(a, 'j');
        //System.out.println(result9);


        BinaryNodeInt aInt = new BinaryNodeInt(3);
        BinaryNodeInt bInt = new BinaryNodeInt(11);
        BinaryNodeInt cInt = new BinaryNodeInt(4);
        BinaryNodeInt dInt = new BinaryNodeInt(4);
        BinaryNodeInt eInt = new BinaryNodeInt(-2);
        BinaryNodeInt fInt = new BinaryNodeInt(1);

        aInt.left = bInt;
        aInt.right = cInt;
        bInt.left = dInt;
        bInt.right = eInt;
        cInt.right = fInt;

        BinaryDepthFirst binaryDepthFirstInt = new BinaryDepthFirst(a);
        Integer result10 = binaryDepthFirstInt.treeSum(aInt);
        //System.out.println(result10);

        BinaryBreadthFirst binaryBreadthFirstInt = new BinaryBreadthFirst(aInt);
        Integer result11 = binaryBreadthFirstInt.treeSum(aInt);
        System.out.println(result11);
    }



}
