public class Board {
    
    // instance variables
    private int width;
    private int height;
    private String[][] field;

    // constructor
    public Board(int width, int height) {
        String[] row = new String[width];
        String[][] gameBoard = new String[height][width];
        for (int i = 0; i < width; i++) {
            row[i] = "-";
        }
        for (int i = 0; i < height; i++) {
            gameBoard[i] = row;
        }
        field = gameBoard;
    }
    
    public String getField() {
        String board = "";
        for (int i = 0; i < field.length; i++) {
            String boardRow = "";
            for (int j = 0; j < field[i].length; j++) {
                boardRow += field[i][j];
            }
            boardRow += "\n";
            board += boardRow;
        }
        return board;
    }
}