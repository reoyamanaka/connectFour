public class Game {
    private boolean status;

    public Game() {
        this.status = true;
        System.out.println("\nGAME STARTED\n");
        System.out.println("Player 1: X");
        System.out.println("Player 2: O");
    }

    public boolean gameOn() {
        return this.status;
    }

    public void gameOver() {
        this.status = false;
    }
}