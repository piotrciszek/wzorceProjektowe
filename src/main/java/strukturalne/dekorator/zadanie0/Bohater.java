package strukturalne.dekorator.zadanie0;

public class Bohater implements IBohater{
    private String name;
    private int health;
    private int stamina;
    private int defencePoints;
    private int attackPoints;

    public Bohater(String name) {
        this.name = name;
        this.health = 100;
        this.stamina = 100;
        this.defencePoints = 100;
        this.attackPoints = 100;
    }

    @Override
    public String toString() {
        return "Bohater{" +
                "health=" + health +
                ", stamina=" + stamina +
                ", name='" + name + '\'' +
                ", defencePoints=" + defencePoints +
                ", attackPoints=" + attackPoints +
                '}';
    }

    public int getHealth() {
        return health;
    }

    public Bohater setHealth(int health) {
        this.health = health;
        return this;
    }

    public int getStamina() {
        return stamina;
    }

    public Bohater setStamina(int stamina) {
        this.stamina = stamina;
        return this;
    }

    public String getName() {
        return name;
    }

    public Bohater setName(String name) {
        this.name = name;
        return this;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public Bohater setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
        return this;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public Bohater setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
        return this;
    }
}
