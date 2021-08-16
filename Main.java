import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board(10, 6);
        Scanner gameMaster = new Scanner(System.in);
        System.out.println(board.getField());

        while (game.gameOn()) {
            String option = gameMaster.nextLine();
            if (option.equals("gameSet")) {
                game.gameOver();
            } 
            game.runTurn(game.currentTurn(), game, board, gameMaster);
            if (board.winner() == 1) {
                game.gameOver();
                System.out.println("Player 1 has won.");
            }
            System.out.println(board.getField());
        }
    }
}