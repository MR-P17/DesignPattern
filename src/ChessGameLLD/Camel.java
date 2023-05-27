package ChessGameLLD;

public class Camel extends ChessPiece{
    public Camel(Color color, String name){
        super(PieceType.CAMEL, color, name);
    }

    @Override
    public boolean isValidMove(Cell start, Cell end) {
        return false;
    }
}
