import ap.algo.KillTheMonster;

public class Main {

    public static void main(String[] args) {
        KillTheMonster x = new KillTheMonster();
        x.addToHorde(10, 15);
        x.addToHorde(16, 2);
        x.addToHorde(9, 0);
        x.addToHorde(0, 17);
        x.sortHorde();
        x.killThemAll(3);
    }
}
