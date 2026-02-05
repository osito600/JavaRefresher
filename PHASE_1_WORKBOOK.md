# Phase 1: The Warm-Up Workbook
*Methodology: Search-Driven Development. Don't read a tutorial start-to-finish. Only Google the specific syntax you need to solve the immediate problem.*

## Day 1: Input & Output (The Skeleton)
**Goal:** specific syntax for `System.out` and `Scanner`.
**Task:** Open `Day1_GuessNumber.java`. 
1. Initialize a `Scanner` to read keyboard input.
2. Hardcode a "secret number" (e.g., 50).
3. Ask the user to guess.
4. Print the number they guessed back to them.

## Day 2: Control Flow (The Logic)
**Goal:** `if`, `else`, `while`, `break`.
**Task:** Modify your code from Day 1.
1. Generate a **random** number between 1-100 (Google: "Java Random class").
2. Wrap the guessing logic in a `while` loop.
3. If guess > secret: Print "Too high!"
4. If guess < secret: Print "Too low!"
5. If guess == secret: Print "Correct!" and exit the loop.

## Day 3: Object-Oriented Basics (The Structure)
**Goal:** Classes, Fields, Methods.
**Task:** 
1. Create a new file `Game.java`.
2. Move the logic out of `main`.
3. The Class should have fields: `int secretNumber`, `int attempts`.
4. It should have a method: `public void start()`.
5. Your `main` method should only look like this:
   ```java
   Game myGame = new Game();
   myGame.start();
   ```

## Day 4: Inheritance (The Variation)
**Goal:** `extends`, `super`, `@Override`.
**Task:**
1. Create a class `HardModeGame` that extends `Game`.
2. Override the `start()` method (or a setup method) so the number range is 1-1000.
3. Give the player only 5 lives. If `attempts > 5`, Game Over.

## Day 5: Collections (The Memory)
**Goal:** `ArrayList`, `for-each` loop.
**Task:**
1. In `main`, allow the user to play multiple games in a row.
2. Create an `ArrayList<Integer>` to store the score (number of guesses) for each game.
3. When the user quits, print out their match history: "Game 1: 5 tries", "Game 2: 3 tries".
