package SnakeAndLadderLLD;

import java.util.Random;

public class Board {
    Cell [][] cells;

    public Board(int boardSize, int snakeCount, int ladderCount) {
        initializeBoard(boardSize);
        addSnakeAndLadder(cells, snakeCount, ladderCount);
    }

    public void initializeBoard(int size){
        cells = new Cell[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    public void addSnakeAndLadder(Cell[][] cells, int snakeCount, int ladderCount){
        Random rand = new Random();
        int size = cells.length * cells.length;
        while(snakeCount > 0){
            int snakeHead = rand.nextInt(size-1) + 1;
            int snakeTail = rand.nextInt(size-1) +1;
            if(snakeTail >= snakeHead)
                continue;

            SnakeLadder snakeLadder = new SnakeLadder(snakeHead, snakeTail);
            Cell cell  = getCell(snakeHead);
            cell.snakeLadder = snakeLadder;

            snakeCount--;
        }

        while(ladderCount > 0){
            int ladderStart = rand.nextInt(size-1) + 1;
            int ladderEnd = rand.nextInt(size-1) + 1;
            if(ladderStart >= ladderEnd)
                continue;

            SnakeLadder snakeLadder = new SnakeLadder(ladderStart, ladderEnd);
            Cell cell = getCell(ladderStart);
            cell.snakeLadder = snakeLadder;

            ladderCount--;
        }
    }

    public Cell getCell(int pos){
        int size = cells.length;
        int row = pos/size;
        int col = pos%size;
        return cells[row][col];
    }


}
