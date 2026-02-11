import java.util.Random;

public class HardModeGame extends Game {

    public HardModeGame() {
        // Calls the Game() constructor first
        super();
        
        // Override the secretNumber to be between 1 and 1000
        Random rand = new Random();
        this.secretNumber = rand.nextInt(1000) + 1;
        
        System.out.println("HARD MODE ACTIVATED: Range is 1-1000 and you only have 5 lives!");
    }

    @Override
    public void start() {
        System.out.println("\n--- Starting HARD MODE Game ---");
        System.out.println("Hello " + this.playerName + "! I have picked a number between 1 and 1000.");
        
        boolean keepPlaying = true;
        int maxLives = 5;

        while(keepPlaying) {
            if (this.attempts >= maxLives) {
                System.out.println("\nGAME OVER! You've used all " + maxLives + " lives.");
                System.out.println("The secret number was: " + this.secretNumber);
                break;
            }

            System.out.print("Attempts left: " + (maxLives - this.attempts) + ". Enter guess: ");
            
            // Check if there is an integer input
            if (scanner.hasNextInt()) {
                int guess = scanner.nextInt();
                this.attempts++;
                
                if (guess > this.secretNumber) {
                    System.out.println("Too high!");
                } else if (guess < this.secretNumber) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("LEGENDARY! Correct, " + this.playerName + "! You beat Hard Mode in " + this.attempts + " attempts.");
                    keepPlaying = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
            }
        }
    }
}