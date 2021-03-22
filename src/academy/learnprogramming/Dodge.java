package academy.learnprogramming;

public class Dodge extends CarChallenge {
    private int roadServiceMonths;

    public Dodge(int roadServiceMonths) {
        super("Dodge", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate (int rate){
        int newVelo = getCurrentVelo() + rate;
        if (newVelo == 0){
            stop();
            changeGear(1);
        } else if (newVelo > 0 && newVelo <= 10) {
            changeGear(1);
        } else if (newVelo > 10 && newVelo <= 20) {
            changeGear(2);
        }else if (newVelo > 20 && newVelo <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if(newVelo > 0) {
            changeVelocity(newVelo, getCurrentDirect());
        }
    }
}
