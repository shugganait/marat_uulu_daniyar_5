public class Hero {
    private int health;
    private int damage;
    private String superAbility;

    public int getHealth() {
        return health;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public int getDamage() {
        return damage;
    }

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

}
