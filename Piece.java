public class Piece {
    private int x;
    private char type;

    public Piece (int initX, char pieceType) {
        x = initX;
        type = pieceType;
    }

    public boolean insertPiece(Board gameBoard) {
        return gameBoard.update(this.x, this.type);
    }

}