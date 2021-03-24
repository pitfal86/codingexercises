package academy.learnprogramming;

public class HamburgerHealthy extends Hamburger {
    private boolean extraLettuce;
    private boolean extraTomato;

    public HamburgerHealthy(String meat, double price, String name) {
        super("brown rye bread roll", meat, price, name);
    }

    public void hasExtraLettuce(boolean extraLettuce) {
        this.extraLettuce = extraLettuce;
        calculatePrice();
    }

    public void hasExtraTomato(boolean extraTomato) {
        this.extraTomato = extraTomato;
        calculatePrice();
    }

    @Override
    public void calculatePrice() {
        super.calculatePrice();
        int count = getCountOfAdditions();
        if (this.extraTomato){
            count ++;
        }
        if (this.extraLettuce){
            count ++;
        }
        setCountOfAdditions(count);
        setTotalPrice((getCountOfAdditions() * getAdditionCharge()) + getPrice());
    }

    @Override
    public String toString() {
        return super.toString() + " extraTomato: " + this.extraTomato + " extraLettuce: " + this.extraLettuce;
    }
}
