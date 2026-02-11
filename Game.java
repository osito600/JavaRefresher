import java.util.Scanner;
import java.util.Random;

public class Game {
    // Fields (Data specific to this object)
    protected String playerName;
    protected int secretNumber;
    protected int attempts;
    protected Scanner scanner;

    // Constructor (Sets up the data)
    public Game() {
        this.scanner = new Scanner(System.in);
        
        // Ask for the player's name
        System.out.print("Enter your name: ");
        this.playerName = scanner.nextLine();
        
        // Initialize secretNumber (1-100) using Random
        Random rand = new Random();
        this.secretNumber = rand.nextInt(100) + 1;
        this.attempts = 0;
    }

    // Method (Behavior)
    public void start() {
        System.out.println("\n--- Starting New Game ---");
        System.out.println("Hello " + this.playerName + "! I have picked a number between 1 and 100.");
        
        boolean keepPlaying = true;
        while(keepPlaying) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            this.attempts++;
            
            if (guess > this.secretNumber) {
                System.out.println("Too high!");
            } else if (guess < this.secretNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct, " + this.playerName + "! It took you " + this.attempts + " attempts.");
                keepPlaying = false;
            }
        }
    }
}
