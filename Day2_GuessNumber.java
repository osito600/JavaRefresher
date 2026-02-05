import java.util.Scanner;
import java.util.Random;

public class Day2_GuessNumber {

    public static void main(String[] args) {
        System.out.println("--- Day 2: The Loop ---");
        
        Scanner scanner = new Scanner(System.in);
        
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1;

        System.out.println("I have picked a number between 1 and 100.");
        
        boolean keepPlaying = true;
        
        while (keepPlaying) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            
            if (guess > secret) {
                System.out.println("Too high!");
            } else if (guess < secret) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct!");
                keepPlaying = false;
            }
        }
        
        System.out.println("Game Over. The number was " + secret);
        scanner.close();
    }
}