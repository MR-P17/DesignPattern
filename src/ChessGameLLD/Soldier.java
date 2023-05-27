package ChessGameLLD;

public class Soldier extends ChessPiece{
    public Soldier(Color color, String name){
        super(PieceType.SOLDIER, color, name);
    }

    @Override
    public boolean isValidMove(Cell start, Cell end) {
        return false;
    }
}
