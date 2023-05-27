package ChessGameLLD;

public class King extends ChessPiece{
    public King(Color color, String name) {
        super(PieceType.KING, color, name);
    }

    @Override
    public boolean isValidMove(Cell start, Cell end) {
        return false;
    }
}
