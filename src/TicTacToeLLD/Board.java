package TicTacToeLLD;

public class Board {
    int size;
    PlayingPiece [][] board;

    public Board(int size) {
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int col, PlayingPiece playingPiece){
        if(board[row][col] != null)
            return false;
        board[row][col] = playingPiece;
        return true;
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] == null ) System.out.print(" ");
                else System.out.print(board[i][j].pieceType.name());
                if(j != size-1) System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public int getFreeCellCount(){
        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] == null)
                    count++;
            }
        }
        return count;
    }

    public boolean CheckIfWinner(int row, int col, PieceType pieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diaMatch = true;
        boolean RDiMatch = true;

        for(int i=0;i< size;i++){
            if(board[row][i] == null || board[row][i].pieceType != pieceType)
                rowMatch = false;
        }

        for(int i=0;i<size;i++){
            if(board[i][col] == null || board[i][col].pieceType != pieceType)
                colMatch = false;
        }

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j] == null || board[i][j].pieceType != pieceType)
                    diaMatch = false;
            }
        }

        for(int i=0;i<size;i++){
            for(int j=size-1;j>=0;j--){
                if(board[i][j] == null || board[i][j].pieceType != pieceType)
                    RDiMatch = false;
            }
        }

        return rowMatch || colMatch || diaMatch || RDiMatch;
    }
}
