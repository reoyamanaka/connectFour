public class Board {
    public static String createBoard(int width, int height) {
        String gameBoard = "";
        for (int i = 0; i < height; i++) {
            String row = "";
            for (int j = 0; j < width; j++) {
                row += "-";
            }
            row += "\n";
            gameBoard += row;
        }
        return gameBoard;
    }
}