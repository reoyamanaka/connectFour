public class Piece {

    // instance variables
    private int x;
    private int y;
    private char type;

    // constructor
    public Piece (int initX, int initY, char pieceType) {
        x = initX;
        y = initY;
        type = pieceType;
    }

    public String getInfo() {
        String infoString = "x-coord: %d, y-coord: %d, piece type: %s";
        infoString = String.format(infoString, this.x, this.y, this.type);
        return infoString;
    }
}