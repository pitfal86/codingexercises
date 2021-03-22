package academy.learnprogramming;

public class Dog extends  Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //    public Dog(String name, int brain, int body, int size, int weight) {
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("dog.chew");
    }

    @Override
    public void eat() {
        System.out.println("dog.eat");
        chew();
        super.eat();
    }

    public void walk (){
        System.out.println("dog.walk");
        //move(5); uses Dog class method
        super.move(5);
        // above uses Animal class method
    }

    public void run (){
        System.out.println("dog.run");
        move(10);
    }

    public void moveLegs (int speed){
        System.out.println("dog.movelegs");
    }

    // this will be called over the one in the Animal class, if you comment out goes to Animal
    @Override
    public void move(int speed) {
        System.out.println("dog.move");
        moveLegs(speed);
        super.move(speed);
    }
}
