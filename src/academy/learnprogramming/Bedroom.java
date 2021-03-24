package academy.learnprogramming;

public class Bedroom {

    private String name;
    private WallChallenge wall1;
    private WallChallenge wall2;
    private WallChallenge wall3;
    private WallChallenge wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, WallChallenge wall1, WallChallenge wall2, WallChallenge wall3, WallChallenge wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("bed made");
        bed.make();
    }
}
