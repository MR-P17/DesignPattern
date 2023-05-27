package ChessGameLLD;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    Board board;
    Queue<Player> queue;
    GameStatus gameStatus;

    public Game(){
        initializeGame();
    }

    public void initializeGame(){
        board = new Board();
        queue = new LinkedList<>();
        gameStatus = null;
        addPlayers();
    }

    public void addPlayers(){
        Player playerB = new Player("P1", Color.BLACK);
        Player playerW = new Player("P2", Color.WHITE);
        queue.add(playerB);
        queue.add(playerW);
    }

    public void startGame(){
        while(gameStatus == null){
            Player playerTurn = queue.peek();
            board.printBoard();

            if(playerTurn.check){
                System.out.println("WARNING!! check for player "+ playerTurn.playerId);
            }

            System.out.print("Player turn is: "+ playerTurn.getPlayerId() + " Choose a chess piece to move [row,col] : ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String [] values = input.split(",");
            int rowX = Integer.parseInt(values[0].trim());
            int colX = Integer.parseInt(values[1].trim());


            boolean isCorrectPos = board.checkIfCorrectPositionPicked(rowX, colX, playerTurn.color);
            if(!isCorrectPos){
                System.out.println("Incorrect/ No piece selected, try again.. ");
                continue;
            }
            System.out.print("Choose a position to move your chess piece [row,col] : ");
            input = sc.nextLine();
            values = input.split(",");
            int rowY = Integer.parseInt(values[0].trim());
            int colY = Integer.parseInt(values[1].trim());
            boolean check = board.checkCorrectEndPosition(rowY, colY);
            if(!check){
                System.out.println("Incorrect position to move selected, try again.. ");
                continue;
            }

            ChessPiece chessPiece = board.getChessPiece(rowX, colX);
            Cell start = board.getCell(rowX, colX);
            Cell end = board.getCell(rowY, colY);

            boolean validMove = chessPiece.isValidMove(start, end);
            if(!validMove){
                System.out.println("Invalid Move, try again..");
                continue;
            }
            queue.remove();
            queue.add(playerTurn);

            boolean currCheck = verifyCheckForCurrentPlayer(playerTurn);
            if(currCheck){
                if(playerTurn.playerId.equals("P1"))
                    gameStatus = GameStatus.P2_WIN;
                else
                    gameStatus = GameStatus.P1_WIN;
                continue;
            }
            playerTurn.setCheck(false);
            boolean oppositeCheck = verifyCheckForOppositePlayer(playerTurn.getColor() == Color.WHITE ? Color.BLACK :Color.BLACK );
            if(oppositeCheck){
                queue.peek().setCheck(true);
            }

            // Add Drawn condition.

         }
        System.out.println("Game result :: "+ gameStatus.name());
    }

    public boolean verifyCheckForCurrentPlayer(Player player){
        return false;
    }

    public boolean verifyCheckForOppositePlayer(Color color){
        return false;
    }

}
