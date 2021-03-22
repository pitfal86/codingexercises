package academy.learnprogramming;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelo;
    private int currentDirect;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirect = 0;
        this.currentDirect = 0;
    }

    public void steer (int direction){
        this.currentDirect += direction;
        System.out.println("Vehicle.steer " + this.currentDirect);
    }

    public void move (int velocity, int direction){
        this.currentDirect = direction;
        this.currentVelo = velocity;
        System.out.println("Vehicle.move " + this.currentVelo + " " + this.currentDirect);
    }

    public void stop (){
        this.currentVelo = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelo() {
        return currentVelo;
    }

    public void setCurrentVelo(int currentVelo) {
        this.currentVelo = currentVelo;
    }

    public int getCurrentDirect() {
        return currentDirect;
    }

    public void setCurrentDirect(int currentDirect) {
        this.currentDirect = currentDirect;
    }
}
