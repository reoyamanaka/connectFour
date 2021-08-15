

public class Game {
    private boolean status;
    private int turn;

    public Game() {
        this.status = true;
        this.turn = 1;
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

    public int currentTurn() {
        return this.turn;
    }

    public boolean runTurn(int player) {
        int playerNum = 1;
        char playerSymbol = 'X';
        if (player == 2) {
            playerNum = 2;
            playerSymbol = 'O';
        }
        String turnMessage = "It is Player %d's (%s's) turn.";
        turnMessage = String.format(turnMessage, playerNum, playerSymbol);
        System.out.println(turnMessage);
        return true;
    }
}