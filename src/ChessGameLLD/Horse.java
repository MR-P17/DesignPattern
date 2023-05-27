package ChessGameLLD;

public class Horse extends ChessPiece{
    public Horse(Color color, String name){
        super(PieceType.HORSE, color, name);
    }

    @Override
    public boolean isValidMove(Cell start, Cell end) {
        return false;
    }
}
