import java.awt.*;

public class Pawn extends Piece {

    private final Piece.Color Color;

    public Pawn(Point p, Color c) {
        this.location = p;
        this.Color = c;
    }

    boolean isMoveLegal(Point target) {
        if (target.y > location.y) {
            if (target.y - location.y <= 2 && location.y == 1) {
                System.out.println("first move");
                return true;
            }
            if (target.y - location.y == 1) {
                if (target.x - location.x == Math.abs(1)) {
                    System.out.println("eat piece");
                    return true;
                }
                if (true) {
                    System.out.println("Normal move. Check if square is free.");
                }
            }
        }
        System.out.println("Ihan vitun laiton siirto.");
        return false;
    }
}
