import java.awt.*;

public class Rook extends Piece {

    private final Piece.Color Color;

    public Rook(Point p, Color c) {
        this.location = p;
        this.Color = c;
    }


    boolean isMoveLegal(Point target) {

        return true;
    }
}