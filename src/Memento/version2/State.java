package Memento.version2;

public class State {
    private int attack;
    private int defense;

    @Override
    public String toString() {
        return "攻击力= "+attack+"---"+"防御力= "+defense;
    }

    public State(int attack, int defense) {
        this.attack = attack;
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
