import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board(10, 6);
        Scanner gameMaster = new Scanner(System.in);
        System.out.println(board.getField());

        while (game.gameOn()) {
            game.runTurn(game.currentTurn(), game, board, gameMaster);
            if (board.winner() == 1 || board.winner() == 2) {
                game.gameOver();
                String finalMessage = "Player %d has won.";
                finalMessage = String.format(finalMessage, board.winner());
                System.out.println(finalMessage);
            }
            System.out.println(board.getField());
        }
    }
}