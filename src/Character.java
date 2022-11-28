public class Character {
    private int damage;

    private int maxHealth;
    private int health;
    private int money;
    private String name;

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void speak(){
        System.out.println("Selam Ben " + this.name);
    }
    public Character(int damage, int health, int money, String name, int maxHealth) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
        this.maxHealth = maxHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
