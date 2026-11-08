public class Warrior implements GameCharacter{
    private final String name;
    private int armor;
    private final int health;

    public Warrior(String name, int armor, int health) {
        this.name = name;
        this.armor = armor;
        this.health = health;
    }

    public String getName() { return name; }
    public int getArmor() { return armor; }
    public void setArmor(int armor) { this.armor = armor; }
    public int getHealth() { return health; }

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this);
    }
}
