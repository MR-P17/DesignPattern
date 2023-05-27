package ChessGameLLD;

public class Queen extends ChessPiece{
    public Queen(Color color, String name){
        super(PieceType.QUEEN, color, name);
    }

    @Override
    public boolean isValidMove(Cell start, Cell end) {
        return false;
    }
}
