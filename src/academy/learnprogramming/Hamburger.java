package academy.learnprogramming;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private boolean pickle;
    private double price;
    private double totalPrice;
    private int countOfAdditions;
    private double additionCharge;

    public Hamburger(String rollType, String meat, double price, String name) {
        this.rollType = rollType;
        this.meat = meat;
        this.price = price;
        this.totalPrice = price;
        this.name = name;
        this.additionCharge = 0.5;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isPickle() {
        return pickle;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getPrice() {
        return price;
    }

    public int getCountOfAdditions() {
        return countOfAdditions;
    }

    public void setCountOfAdditions(int countOfAdditions) {
        this.countOfAdditions = countOfAdditions;
    }

    public void hasLettuce(boolean lettuce) {
        this.lettuce = lettuce;
        calculatePrice();
    }

    public void hasTomato(boolean tomato) {
        this.tomato = tomato;
        calculatePrice();
    }

    public void hasCarrot(boolean carrot) {
        this.carrot = carrot;
        calculatePrice();
    }

    public void hasPickle(boolean pickle) {
        this.pickle = pickle;
        calculatePrice();
    }

    public double getAdditionCharge() {
        return additionCharge;
    }

    public void calculatePrice (){
        int count = 0;
        if (isCarrot()){
            count ++;
        }
        if (isLettuce()){
            count ++;
        }
        if (isPickle()){
            count ++;
        }
        if (isTomato()){
            count ++;
        }
        setCountOfAdditions(count);
        setTotalPrice((getCountOfAdditions() * getAdditionCharge()) + getPrice());
    }

    @Override
    public String toString() {
        return "name: " + this.name + " rolltype: " + this.rollType + " meat: " + this.meat + " lettuce: "
                + this.lettuce + " tomato: " + this.tomato + " pickle: " + this.pickle + " carrot: " + this.carrot
                + " price: " + getTotalPrice() + " countOfAdditions: " + getCountOfAdditions();
    }
}
