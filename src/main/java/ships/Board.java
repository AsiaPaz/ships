package ships;

public class Board {
    public String[] status={ "EMPTY", "SHIP", "SHIP_HIT", "EMPTY_HIT"};
    private String[][] board = new String[10][10];

    public Board() {
           for (int i = 0; i<board.length; i++)
            for (int j=0; j<board[i].length; j++)
                this.board[i][j] = status[0];
    }

}
