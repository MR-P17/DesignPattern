package ChessGameLLD;

public class Board {
    Cell [][] cells;

    public Board(){
        initializeBoard();
        addBlackPieces();
        addWhitePieces();
    }

    public void initializeBoard(){
        cells = new Cell[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                Cell cell = new Cell(i,j);
                cells[i][j] = cell;
            }
        }
    }

    public void addBlackPieces(){
        addPiece(0,0,PieceType.ELEPHANT,Color.BLACK,"BE1");
        addPiece(0,7,PieceType.ELEPHANT,Color.BLACK, "BE2");
        addPiece(0,1,PieceType.HORSE,Color.BLACK, "BH1");
        addPiece(0,6,PieceType.HORSE,Color.BLACK, "BH2");
        addPiece(0,2,PieceType.CAMEL,Color.BLACK, "BC1");
        addPiece(0,5,PieceType.CAMEL,Color.BLACK, "BC2");
        addPiece(0,3,PieceType.QUEEN,Color.BLACK, "BQ_");
        addPiece(0,4,PieceType.KING,Color.BLACK, "BK_");

        for(int i=0;i<8;i++)
            addPiece(1, i,PieceType.SOLDIER, Color.BLACK, "BS"+(i+1));
    }

    public void addWhitePieces(){
        addPiece(7,0,PieceType.ELEPHANT,Color.WHITE,"WE1");
        addPiece(7,7,PieceType.ELEPHANT,Color.WHITE, "WE2");
        addPiece(7,1,PieceType.HORSE,Color.WHITE, "WH1");
        addPiece(7,6,PieceType.HORSE,Color.WHITE, "WH2");
        addPiece(7,2,PieceType.CAMEL,Color.WHITE, "WC1");
        addPiece(7,5,PieceType.CAMEL,Color.WHITE, "WC2");
        addPiece(7,3,PieceType.QUEEN,Color.WHITE, "WQ_");
        addPiece(7,4,PieceType.KING,Color.WHITE, "WK_");

        for(int i=0;i<8;i++)
            addPiece(6, i,PieceType.SOLDIER, Color.WHITE, "WS"+(i+1));
    }

    public void addPiece(int row, int col, PieceType type, Color color, String name){
        ChessPieceFactory chessPieceFactory = new ChessPieceFactory();
        ChessPiece chessPiece = chessPieceFactory.getChessPiece(type, color, name);
        cells[row][col].setPiece(chessPiece);
    }

    public void printBoard(){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(cells[i][j].getPiece() == null) System.out.print("   ");
                else System.out.print(cells[i][j].getPiece().pieceName);
                if(j<7) System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public boolean checkIfCorrectPositionPicked(int row, int col, Color color){
        return row >= 0 && row < 8 && col >= 0 && col < 8 &&  cells[row][col].getPiece() != null && cells[row][col].getPiece().color == color;
    }

    public ChessPiece getChessPiece(int row, int col){
        return cells[row][col].getPiece();
    }

    public Cell getCell(int row, int col){
        return cells[row][col];
    }

    public boolean checkCorrectEndPosition(int row, int col){
        return row >= 0 && row < 8 && col >=0 && col < 8;
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.printBoard();
    }
}
