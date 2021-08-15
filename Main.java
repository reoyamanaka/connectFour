import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board(10, 6);
        Scanner gameMaster = new Scanner(System.in);
        while (game.gameOn()) {
            System.out.println(board.getField());
            String option = gameMaster.nextLine();
            if (option.equals("gameSet")) {
                game.gameOver();
            } 
            if (game.currentTurn() == 1) {
                System.out.println("It is Player 1's (X's) turn.");
                System.out.println("Enter column number: ");
                int columnInput = gameMaster.nextInt();
                Piece chosenPiece = new Piece(columnInput, 'X');
                chosenPiece.insertPiece(board);
            } else if (game.currentTurn() == 2) {
                System.out.println("It is Player 2's (O's) turn.");
            }
        }
    }
}