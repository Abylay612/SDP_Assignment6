public class ReportVisitor implements GameVisitor{
    @Override
    public void visit(Warrior warrior) {
        System.out.println("[Report] Warrior: " + warrior.getName() + " | Health: " + warrior.getHealth() + " | Armor: " + warrior.getArmor());
    }

    @Override
    public void visit(Mage mage) {
        System.out.println("[Report] Mage: " + mage.getName() + " | Mana: " + mage.getmana() + " | Shield: " + mage.getShield());
    }
}
