import java.util.Scanner;

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

    public void nextTurn() {
        if (this.turn == 1) {
            this.turn = 2;
        } else {
            this.turn = 1;
        }
    }

    public boolean runTurn(int player, Game game, Board board, Scanner gameMaster) {
        char playerSymbol = 'X';
        if (player == 2) {
            playerSymbol = 'O';
        }
        String turnMessage = "It is Player %d's (%s's) turn.";
        turnMessage = String.format(turnMessage, player, playerSymbol);
        System.out.println(turnMessage);

        int godX = gameMaster.nextInt();
        int godY = gameMaster.nextInt();
        Piece chosenPiece = new Piece(godX, playerSymbol);



        // System.out.println("Enter column number: ");
        // int columnInput = gameMaster.nextInt();
        // Piece chosenPiece = new Piece(columnInput, playerSymbol);
        // if (chosenPiece.insertPiece(board)) {
        //     game.nextTurn();
        //     return true;
        // } 
        
        if (chosenPiece.insertPieceAsGod(godX, godY, board)) {
            game.nextTurn();
            return true;
        } 
        return false;
    }
}