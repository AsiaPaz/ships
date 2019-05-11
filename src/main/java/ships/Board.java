package ships;

import java.util.Arrays;

public class Board {
    public String[] status={ "EMPTY", "SHIP", "SHIP_HIT", "EMPTY_HIT"};
    private String[][] board = new String[10][10];

    public Board() {
           for (int i = 0; i<board.length; i++)
            for (int j=0; j<board[i].length; j++)
                this.board[i][j] = status[0];
    }

    public String[] getStatus() {
        return status;
    }

    public void setStatus(String[] status) {
        this.status = status;
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Board board1 = (Board) o;
        return Arrays.equals(status, board1.status) &&
                Arrays.equals(board, board1.board);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(status);
        result = 31 * result + Arrays.hashCode(board);
        return result;
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(board) +
                '}';
    }
}
