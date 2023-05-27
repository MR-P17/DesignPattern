package ChessGameLLD;

public class Cell {
    ChessPiece piece;
    int row;
    int col;

    public Cell( int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Cell() {

    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }


    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
