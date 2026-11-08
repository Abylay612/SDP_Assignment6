public class Mage implements GameCharacter{
    private final String name;
    private int mana;
    private final int shield;

    public Mage(String name, int mana, int shield) {
        this.name = name;
        this.mana = mana;
        this.shield = shield;
    }

    public String getName() { return name; }
    public int getmana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }
    public int getShield() { return shield; }

    @Override
    public void accept(GameVisitor visitor) {
        visitor.visit(this); // Двойная диспетчеризация для Мага
    }
}
