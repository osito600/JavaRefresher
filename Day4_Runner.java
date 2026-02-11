public class Day4_Runner {
    public static void main(String[] args) {
        // We are using polymorphism here!
        // A HardModeGame "is a" Game.
        Game myGame = new HardModeGame();
        myGame.start();
    }
}
