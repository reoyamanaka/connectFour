public class Board {
    private int width;
    private int height;
    private char[][] field;

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
        char[] bottomCoords = new char[this.field[0].length];
        for (int i = 0; i < this.field[0].length; i++) {
            bottomCoords[i] = (char)((i) + '0');
        }
        this.field[this.field.length - 1] = bottomCoords;
    }

    public boolean update(int x, char type) {
        boolean updated = false;
        for (int i = this.field.length - 1; i > -1; i--) {
            if (this.field[i][x] == '-') {
                this.field[i][x] = type;
                updated = true;
                break;
            }
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