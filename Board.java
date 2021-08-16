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
        if (!this.rowFull(x)) {
            for (int i = this.field.length - 1; i > -1; i--) {
                if (this.field[i][x] == '-') {
                    this.field[i][x] = type;
                    updated = true;
                    break;
                }
            }
        } else {
            System.out.println("This column is full. Choose another.");
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
    
    public boolean rowFull(int column) {
        return this.field[0][column] != '-';
    }

    public int winner() {
        int winner = 0;
        int player1Counter = 0;
        int player2Counter = 0;

        // checking all vertical win options
        for (int i = 0; i < this.field[0].length; i++) {
            int bottom = this.field.length - 2;
            if (this.field[bottom][i] == 'X') {
                while (bottom > 0) {
                    if (this.field[bottom][i] == 'X') {
                        player1Counter++;
                        if (player1Counter == 4) {
                            return 1;
                        }
                    } else {
                        player1Counter = 0;
                        break;
                    }
                    bottom--;
                }
            } else if (this.field[bottom][i] == 'O') {
                while (bottom > 0) {
                    if (this.field[bottom][i] == 'O') {
                        player2Counter++;
                        if (player2Counter == 4) {
                            return 2;
                        }
                    } else {
                        player2Counter = 0;
                        break;
                    }
                    bottom--;
                }
            }
        }

        // checking all horizontal win options
        for (int i = 0; i < this.field.length; i++) {
            for (int j = 0; j < this.field[0].length - 3; j++) {
                if (this.field[i][j] == 'X' && this.field[i][j + 1] == 'X' && this.field[i][j + 2] == 'X' && this.field[i][j + 3] == 'X') {
                    return 1;
                }
                else if (this.field[i][j] == 'O' && this.field[i][j + 1] == 'O' && this.field[i][j + 2] == 'O' && this.field[i][j + 3] == 'O') {
                    return 2;
                }
            }
        }    

        // checking all diagonal win options


        return winner;
    }
}