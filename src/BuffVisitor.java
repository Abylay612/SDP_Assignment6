public class BuffVisitor implements GameVisitor{
    @Override
    public void visit(Warrior warrior) {
        warrior.setArmor(warrior.getArmor() + 20);
        System.out.println("Buff applied: Warrior " + warrior.getName() + " got +20 Armor!");
    }

    @Override
    public void visit(Mage mage) {
        mage.setMana(mage.getMana() + 50);
        System.out.println("Buff applied: Mage " + mage.getName() + " got +50 Mana!");
    }
}
