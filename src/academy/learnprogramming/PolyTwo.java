package academy.learnprogramming;

public class PolyTwo {

    public static PolyCar randomCar (){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println(randomNumber);
        switch (randomNumber){
            case 1:
                return new Toyota("outlander", 6);
            case 2:
                return new Subaru("impreza", 8);
            case 3:
                return new Audi("TT", 12);
            default:
                return null;
        }
    }

}

class PolyCar {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public PolyCar(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine  (){
        return "Car -> startEnginer()";
    }

    public String accelerate (){
        return "Car -> accelerate()";
    }

    public String brake (){
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Toyota extends PolyCar {
    public Toyota(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        //super.startEngine();
        return "Toyota -> startEnginer()";
    }

    @Override
    public String accelerate() {
        return "Toyota -> accelerate()";
    }

    @Override
    public String brake() {
        return "Toyota -> brake()";
    }
}

class Subaru extends PolyCar {
    public Subaru(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        //super.startEngine();
        return "Subaru -> startEnginer()";
    }

    @Override
    public String accelerate() {
        return "Subaru -> accelerate()";
    }

    @Override
    public String brake() {
        return "Subaru -> brake()";
    }
}

class Audi extends  PolyCar {
    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }
}