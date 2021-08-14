public class Board {
    
    // instance variables
    private int width;
    private int height;
    private String field;

    // constructor
    public Board(int initWidth, int initHeight) {
        width = initWidth;
        height = initHeight;
        String gameBoard = "";
        for (int i = 0; i < height; i++) {
            String row = "";
            for (int j = 0; j < width; j++) {
                row += "-";
            }
            row += "\n";
            gameBoard += row;
        }
        field = gameBoard;
    }
    
    public String getField() {
        return this.field;
    }
}