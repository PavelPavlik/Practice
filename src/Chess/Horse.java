package Chess;

public class Horse extends ChessPiece {

    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (checkPos(line) && checkPos(column) && checkPos(toLine) && checkPos(toColumn)) {
            if (line != toLine && column != toColumn) {
                int[][] positions = new int[][]{
                        {line - 2, column - 1},
                        {line - 2, column + 1},
                        {line + 2, column - 1},
                        {line + 2, column + 1},
                        {line - 1, column - 2},
                        {line - 1, column + 2},
                        {line + 1, column - 2},
                        {line + 1, column + 2}};
                for (int i = 0; i < positions.length; i++) {
                    if (positions[i][0] == toLine && positions[i][1] == toColumn) {
                        return true;
                    }
                }
            }
        } else return false;
        return false;
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
