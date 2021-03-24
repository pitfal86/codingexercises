package academy.learnprogramming;

public class HamburgerDeluxeAnswer extends  HamburgerAnswer{

    public HamburgerDeluxeAnswer() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        //super.addHamburgerAddition1(name, price);
        System.out.println("Cannot add additional");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        //super.addHamburgerAddition1(name, price);
        System.out.println("Cannot add additional");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        //super.addHamburgerAddition1(name, price);
        System.out.println("Cannot add additional");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        //super.addHamburgerAddition1(name, price);
        System.out.println("Cannot add additional");
    }
}
