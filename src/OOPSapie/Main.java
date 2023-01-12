package OOPSapie;

public class Main {
    public static void main(String[] args) {

        Enemy enemy = new Enemy();
        enemy.Talk();

        Vampire vampire = new Vampire();
        vampire.Talk();

        vampire.setHealth(25);
        vampire.getHealth();

        Werewolf werewolf = new Werewolf();
        werewolf.Talk();

        Enemy enemy1=vampire;
        enemy1.Talk();

        Enemy[] enemies={vampire, werewolf};
        enemies[0].Talk();
        enemies[1].Talk();


    }
}
