package ChessGameLLD;

public abstract class ChessPiece {
    PieceType pieceType;
    Color color;
    String pieceName;

    public abstract boolean isValidMove(Cell start, Cell end);

    public ChessPiece(PieceType pieceType, Color color, String pieceName) {
        this.pieceType = pieceType;
        this.color = color;
        this.pieceName = pieceName;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public Color getColor() {
        return color;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPieceName(String pieceName) {
        this.pieceName = pieceName;
    }
}
