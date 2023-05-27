package ChessGameLLD;

public class Elephant extends ChessPiece{
    public Elephant(Color color, String name){
        super(PieceType.ELEPHANT, color, name);
    }

    @Override
    public boolean isValidMove(Cell start, Cell end) {
        return false;
    }
}
