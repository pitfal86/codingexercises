package academy.learnprogramming;

public class HamburgerDeluxe extends  Hamburger{
    private boolean chips;
    private boolean drink;
    private double priceChipsOrDrink;

    public HamburgerDeluxe(String rollType, String meat, double price, String name) {
        super(rollType, meat, price, name);
        this.chips = true;
        this.drink = true;
        this.priceChipsOrDrink = 2.00;
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        super.calculatePrice();
        int count = 0;
        if (this.chips){
            count ++;
        }
        if (this.drink){
            count ++;
        }
        setTotalPrice((getCountOfAdditions() * getAdditionCharge()) + getPrice() + (count * this.priceChipsOrDrink));
    }

    @Override
    public String toString() {
        return super.toString() + " chips: " + this.chips + " drink: " + this.drink;
    }


}
