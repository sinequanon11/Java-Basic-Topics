package OOPSapie;

public class Enemy {

    private int health;

    public void Talk(){

        System.out.println("I am an enemy. You better run!");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
