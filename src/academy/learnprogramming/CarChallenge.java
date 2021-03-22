package academy.learnprogramming;

public class CarChallenge extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public CarChallenge(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear " + this.currentGear);
    }

    public void changeVelocity (int speed, int direction){
        System.out.println("Car.changeVelocity " + speed + " " + direction);
        move(speed, direction);
    }
}
