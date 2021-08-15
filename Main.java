import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Board board = new Board(10, 6);
        Scanner gameMaster = new Scanner(System.in);
        while (game.gameOn()) {
            System.out.println(board.getField());
            int option = gameMaster.nextInt();
            if (option == 4) {
                game.gameOver();
            } 
            System.out.println(option);
            System.out.println(game.gameOn());
        }
    }
}