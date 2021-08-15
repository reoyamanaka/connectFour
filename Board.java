public class Board {
    // instance variables
    private int width;
    private int height;
    private char[][] field;

    // constructor
    public Board(int width, int height) {
        char[][] gameBoard = new char[height + 1][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                gameBoard[i][j] = '-';
            }
        }
        field = gameBoard;
        this.addCoordinates();

    }

    private void addCoordinates() {
        for (int i = 0; i < this.field.length; i++) {
            this.field[i][0] = (char)(i + '0');
        }
        char[] bottomCoords = new char[this.field[0].length];
        for (int i = 0; i < this.field[0].length; i++) {
            if (i == 0) {
                bottomCoords[i] = ' ';
            } else {
                bottomCoords[i] = (char)((i - 1) + '0');
            }
        }
        this.field[this.field.length - 1] = bottomCoords;
    }

    public boolean update(int x, int y, char type) {
        boolean updated = false;
        if (this.field[x][y] == '-') {
            this.field[x][y] = type;
            updated = true;
        } else {
            System.out.println("There is already a piece in this slot!");
        }
        return updated;
    }
    
    public String getField() {
        String board = "\n";
        for (int i = 0; i < this.field.length; i++) {
            String boardRow = "";
            for (int j = 0; j < this.field[i].length; j++) {
                boardRow += this.field[i][j];
            }
            boardRow += "\n";
            board += boardRow;
        }
        return board;
    }
}