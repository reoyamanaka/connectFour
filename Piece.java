public class Piece {
    private int x;
    private int y;
    private char type;
    private Board board;

    public Piece (int initX, int initY, char pieceType, Board gameBoard) {
        x = initX;
        y = initY;
        type = pieceType;
        board = gameBoard;
    }

    public boolean insertPiece(Board gameBoard) {
        return gameBoard.update(this.x, this.y, this.type);
    }

    public String getInfo() {
        String infoString = "x-coord: %d, y-coord: %d, piece type: %s";
        infoString = String.format(infoString, this.x, this.y, this.type);
        return infoString;
    }
}