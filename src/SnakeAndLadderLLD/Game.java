package SnakeAndLadderLLD;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    Board board;
    Dice dice;
    Queue<Player> q;
    Player winner;

    public Game(int boardSize, int snakeCount, int ladderCount, int diceCount){
        initializeGame(boardSize, snakeCount, ladderCount, diceCount);
    }

    private void initializeGame(int boardSize, int snakeCount, int ladderCount, int diceCount){
        board = new Board(boardSize, snakeCount, ladderCount);
        dice = new Dice(diceCount);
        q = new LinkedList<>();
        winner = null;
        addPlayers();
    }

    private void addPlayers(){
        Player player1 = new Player("P1", 1);
        Player player2 = new Player("P2", 1);
        q.add(player1);
        q.add(player2);
    }

    public void startGame(){
        while(winner == null){
            Player player = findPlayerTurn();
            System.out.println("Player turn is: " + player.getId() + " current position is: "+player.getCurrentPos());

            int diceValue = this.dice.rollDice();
            int playerNewPos = player.currentPos + diceValue;
            playerNewPos = jumpIfAvailable(playerNewPos);
            player.currentPos = playerNewPos;

            System.out.println("Player turn is: " + player.getId() + " new position is: "+playerNewPos);

            if(player.currentPos >= board.cells.length * board.cells.length){
                winner = player;
            }
        }
        System.out.println("WINNER IS : " + winner.getId());
    }

    public int jumpIfAvailable(int pos){
        if(pos > board.cells.length * board.cells.length)
            return pos;
        Cell cell = board.getCell(pos);
        if(cell.snakeLadder != null && cell.snakeLadder.start == pos){
            String jumpBy = (cell.snakeLadder.start < cell.snakeLadder.end) ? "ladder" : "snake";
            System.out.println("Jump done by: " +jumpBy);
            return cell.snakeLadder.end;
        }
        return pos;

    }

    public Player findPlayerTurn(){
        Player player = this.q.remove();
        this.q.add(player);
        return player;
    }
}
