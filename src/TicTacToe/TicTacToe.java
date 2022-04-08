package TicTacToe;

import java.util.Arrays;
import java.util.Objects;

public class TicTacToe {
    boolean isStart = true;
    private String result = "";
    private String[][] points;
    int player = 1;

    public TicTacToe() {
        this.points = new String[][]{
                {"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}
        };
    }

    void newGame() {
        isStart = false;
    }

    public String[][] getField() {
        for (int i = 0; i < points.length; i++) {
            System.out.println(Arrays.toString(points[i]));
        }
        return points;
    }

    String checkGame() {
        String check = "";
        switch (result) {
            case "x":
                check = "Won X";
                break;
            case "o":
                check = "Won O";
                break;
            case "d":
                check = "Draw";
                break;
            default:
                check = "null";
        }
        System.out.println(check);
        return check;
    }

    String makeMove(int x, int y) {
        x -= 1;
        y -= 1;
        String cell = "-";
        String move = "";
        String[] cellX = {"X", "X", "X"};
        String[] cellY = {"O","O","O"};

        if (Objects.equals(points[x][y], cell) && player % 2 != 0) {
            points[x][y] = "X";
            move = "Move completed";
            System.out.println(move);
            player++;
        } else if (Objects.equals(points[x][y], cell) && player % 2 == 0) {
            points[x][y] = "O";
            move = "Move completed";
            System.out.println(move);
            player++;
        } else if ((Objects.equals(points[x][y], "X")) || (Objects.equals(points[x][y], "O"))) {
            move = "Cell x, y is already occupied";
            System.out.println(move);
        }

        if ((Arrays.equals(points[0], cellX))||(Arrays.equals(points[1], cellX))||(Arrays.equals(points[2], cellX))){
            result = "x";
            checkGame();
            isStart = true;
        }
        else if ((Arrays.equals(points[0], cellY))||(Arrays.equals(points[1], cellY))||(Arrays.equals(points[2], cellY))) {
            result = "o";
            checkGame();
            isStart = true;
        }

        else if(Objects.equals(points[0][0], "X") && Objects.equals(points[1][1], "X") && Objects.equals(points[2][2], "X")){
            result = "x";
            checkGame();
            isStart = true;
        }
        else if(Objects.equals(points[0][2], "X") && Objects.equals(points[1][1], "X") && Objects.equals(points[2][0], "X")) {
            result = "x";
            checkGame();
            isStart = true;
        }
        else if(Objects.equals(points[0][0], "O") && Objects.equals(points[1][1], "O") && Objects.equals(points[2][2], "O")) {
            result = "o";
            checkGame();
            isStart = true;
        }
        else if(Objects.equals(points[0][2], "O") && Objects.equals(points[1][1], "O") && Objects.equals(points[2][0], "O")) {
            result = "o";
            checkGame();
            isStart = true;
        }
        getField();
        System.out.println();
        return move;
    }
}
