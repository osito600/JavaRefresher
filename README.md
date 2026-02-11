# Java Refresher: Guess the Number Game

This repository contains code for a Java Refresher course, focusing on building a "Guess the Number" game through progressive daily tasks.

## Project Structure

The project follows a phased approach:

- **Day 1 (`Day1_GuessNumber.java`)**: 
  - Focus: Input & Output.
  - Sets up the basic structure with `Scanner` for user input.

- **Day 2 (`Day2_GuessNumber.java`)**: 
  - Focus: Control Flow (Loops and Conditionals).
  - Implements the game logic with a `while` loop and feedback.

- **Day 3 (`Game.java` & `Day3_Runner.java`)**:
  - Focus: Object-Oriented Basics.
  - Refactors the game logic into a `Game` class.
  - Introduces fields (`playerName`, `secretNumber`, `attempts`) and methods (`start`).

- **Day 4 (`HardModeGame.java` & `Day4_Runner.java`)**:
  - Focus: Inheritance.
  - `HardModeGame` extends `Game` to create a more difficult version.
  - Overrides `start()` to implement a life system (5 lives) and increases the number range (1-1000).

- **Workbook (`PHASE_1_WORKBOOK.md`)**:
  - Contains the roadmap and instructions for Phase 1 of the refresher.

## How to Run

1. Compile the Java files:
   ```bash
   javac Day4_Runner.java HardModeGame.java Game.java
   ```
2. Run the application:
   ```bash
   java Day4_Runner
   ```

## Roadmap

- [x] Day 1: Input & Output
- [x] Day 2: Control Flow
- [x] Day 3: Object-Oriented Basics
- [x] Day 4: Inheritance
- [ ] Day 5: Collections
