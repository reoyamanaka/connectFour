public class Main {
    public static void main(String[] args) {
        Board board = new Board(10, 6);
        // board.addCoordinates();
        System.out.println("\nGAME STARTED\n");
        System.out.println("Player 1: X");
        System.out.println("Player 2: O");
        System.out.println(board.getField());
    }
}