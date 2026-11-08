# Assignment #6 — Visitor Pattern (`GameCharacter`)

## Project Overview
This project implements the **Visitor** behavioral design pattern in Java as part of the Software Design Patterns course. The application demonstrates how to add new operations (such as applying buffs and generating status reports) to an existing object structure containing different types of game characters (`Warrior` and `Mage`) **without modifying their original classes**, utilizing the **double dispatch** mechanism.

---

## Architecture Components
The implementation consists of the following core components:
1. **Element Interface (`GameCharacter`)** — Declares the `accept(GameVisitor visitor)` method required for double dispatch.
2. **Concrete Elements (`Warrior`, `Mage`)** — Represent distinct game character types. Each implements `accept()` by calling the matching `visit()` method on the incoming visitor, passing `this` (the double-dispatch step).
3. **Visitor Interface (`GameVisitor`)** — Declares overloaded `visit()` methods for each concrete element type.
4. **Concrete Visitors (`BuffVisitor`, `ReportVisitor`)** — Encapsulate distinct operations across all element types:
   - `BuffVisitor` applies class-specific stat enhancements (armor or mana).
   - `ReportVisitor` collects and prints current character statistics.
5. **Object Structure (`Main`)** — A collection (list) of game characters that the client traverses, invoking `accept()` on each element.

---

## Clean Code Principles Applied

1. **No `instanceof` / Type-Checking Chains:**
   Type checking and conditional branching based on class types are completely eliminated. The **double dispatch** mechanism automatically routes execution to the correct visitor method based on the runtime types of both the element and the visitor.

2. **Single Responsibility Principle (SRP):**
   Operations are decoupled from the element classes. Each Concrete Visitor encapsulates exactly one distinct operation (e.g., all buffering logic is in `BuffVisitor`, and reporting logic is in `ReportVisitor`), keeping the character classes clean and focused solely on their core state.

3. **Meaningful, Intention-Revealing Names:**
   Classes, methods, and interfaces (`GameCharacter`, `GameVisitor`, `BuffVisitor`, `accept`) clearly convey their responsibilities and design pattern roles without needing redundant comments.

4. **Open/Closed Principle (OCP) / Extensibility:**
   The architecture is open for extension. Adding a new operation (e.g., a `DamageVisitor` or `SaveVisitor`) only requires creating a new visitor class without touching or modifying any existing character classes.

5. **Encapsulation Management:**
   Element states are accessed through well-defined getters and setters, maintaining controlled access to internal object fields while allowing visitors to perform externalized operations safely.

---

## How to Run
1. Open the project in IntelliJ IDEA.
2. Ensure the `src` directory is marked as a **Sources Root**.
3. Compile and run the `Main.java` file:
   ```bash
   javac Main.java
   java Main
