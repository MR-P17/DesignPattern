package ChessGameLLD;

public class ChessPieceFactory {
    public ChessPiece getChessPiece(PieceType type, Color color, String name){
        if(type.equals(PieceType.KING))
            return new King(color, name);
        else if(type.equals(PieceType.QUEEN))
            return new Queen(color, name);
        else if(type.equals(PieceType.CAMEL))
            return new Camel(color, name);
        else if(type.equals(PieceType.HORSE))
            return new Horse(color, name);
        else if(type.equals(PieceType.ELEPHANT))
            return new Elephant(color, name);
        else
            return new Soldier(color, name);
    }
}
