void main() {
    List<GameCharacter> party = new ArrayList<>();
    party.add(new Warrior("Thor", 100, 150));
    party.add(new Mage("Gandalf", 200, 50));

    System.out.println("--- Initial State Report ---");
    GameVisitor reportVisitor = new ReportVisitor();
    for (GameCharacter character : party) {
        character.accept(reportVisitor);
    }

    System.out.println("\n--- Applying Buffs ---");
    GameVisitor buffVisitor = new BuffVisitor();
    for (GameCharacter character : party) {
        character.accept(buffVisitor);
    }

    System.out.println("\n--- Final State Report ---");
    for (GameCharacter character : party) {
        character.accept(reportVisitor);
    }
}