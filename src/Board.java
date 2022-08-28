import java.util.ArrayList;

public class Board {
    ArrayList<ArrayList> board;

    public Board() {
        this.board = new ArrayList<>(8);
        board.add(new ArrayList(8));
        board.add(new ArrayList(8));
        board.add(new ArrayList(8));
        board.add(new ArrayList(8));
        board.add(new ArrayList(8));
        board.add(new ArrayList(8));
        board.add(new ArrayList(8));
        board.add(new ArrayList(8));
    }

    public ArrayList<ArrayList> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<ArrayList> board) {
        this.board = board;
    }
}
