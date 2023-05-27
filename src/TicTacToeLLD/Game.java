package TicTacToeLLD;

import java.util.*;

public class Game {
    Board board;
    Queue<Player> q = new LinkedList<>();

    public Game() {
        initializeGame();
    }
    public void initializeGame(){
        this.board = new Board(3);
        addPlayer();

        Map<String, String> mp = new HashMap<>();
    }

    public void addPlayer(){
        PlayingPiece playingPieceX = new PlayingPieceX();
        Player playerX = new Player("P1", playingPieceX);

        PlayingPiece playingPieceO = new PlayingPieceO();
        Player playerO = new Player("P2", playingPieceO);

        q.add(playerX);
        q.add(playerO);
    }

    public void startGame(){
        boolean winner = false;
        while (!winner){
            Player playerTurn = q.peek();

            board.printBoard();
            int freeCells = board.getFreeCellCount();
            if(freeCells == 0){
                System.out.println("Game is Tie!!");
                winner = true;
                continue;
            }

            System.out.print("Player Turn: "+ playerTurn.getId() + " Enter row,column: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String [] values = input.split(",");
            int row = Integer.parseInt(values[0]);
            int col = Integer.parseInt(values[1]);

            boolean addPlayingPiece = board.addPiece(row, col, playerTurn.playingPiece);
            if(!addPlayingPiece){
                System.out.println("Incorrect position chosen, try again!!");
                continue;
            }
            q.remove();
            q.add(playerTurn);

            boolean isWinner = board.CheckIfWinner(row, col, playerTurn.playingPiece.pieceType);
            if(isWinner){
                System.out.println("Player " + playerTurn.getId() +" won the match.");
                winner =true;
            }
        }
    }
}
