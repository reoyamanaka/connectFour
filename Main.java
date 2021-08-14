public class Main {
    public static void main(String[] args) {
        Board board = new Board(10, 6);
        Piece piece = new Piece(1, 4, 'X');
        System.out.println(board.getField());
    }
}