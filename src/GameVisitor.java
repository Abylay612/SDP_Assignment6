public interface GameVisitor {
    void visit(Warrior warrior);
    void visit(Mage mage);
}
