package ap.algo;

public class Monster implements Comparable<Monster> {
    private Integer hp;
    private Integer prize;

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getPrize() {
        return prize;
    }

    public void setPrize(Integer prize) {
        this.prize = prize;
    }

    public Monster(Integer hp, Integer prize) {
        this.hp = hp;
        this.prize = prize;
    }

    public Integer getDifference() {
        return this.prize-this.hp;
    }

    @Override
    public int compareTo(Monster that) {
        return (that.getDifference()) - (this.getDifference());
    }
}
