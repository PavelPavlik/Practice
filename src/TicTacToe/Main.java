package TicTacToe;

public class Main {
    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
//        board.newGame();
        board.getField();
        board.makeMove(1,3);
        board.makeMove(2,1);
        board.makeMove(2,2);
        board.makeMove(1,2);
        board.makeMove(3,1);
        board.makeMove(2,3);


    }
}
