package academy.learnprogramming;

public class PlayerEnhanced {
    private String name;
    private int hitpoints = 100;
    private String weapon;

    public PlayerEnhanced(String name, int hitpoints, String weapon) {
        this.name = name;
        if (hitpoints > 0 && hitpoints <= 100){
            this.hitpoints = hitpoints;
        }
        this.weapon = weapon;
    }

    public void lostHealth (int damage){
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitpoints;
    }
}
