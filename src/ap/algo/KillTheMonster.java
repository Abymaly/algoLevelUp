// problem: there is a lot of monsters.
// Each have some cost to kill them and some prize witch we take after killing it.
// Kill all the monsters if it's possible or die.

package ap.algo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KillTheMonster {
    List<Monster> horde = new ArrayList<>();

    public void addToHorde(Integer hp, Integer prize) {
        horde.add(new Monster(hp, prize));
    }

    public void sortHorde() {
        Collections.sort(horde);
    }

    private boolean allKilled() {
        return horde.isEmpty();
    }

    public void killThemAll(int power) {
        while (!allKilled()) {
            for (Monster monster : horde) {
                if (power >= monster.getHp()) {
                    power += monster.getDifference();
                    horde.remove(monster);
                    break;
                }
                minstrel();
                return;
            }
        }
        minstrel();
    }

    private void minstrel() {
        String result = allKilled() ? "Tra la la, you are a great warrior!" : "Tra la la, you are just a wet stain";
        System.out.println(result);
    }
}
