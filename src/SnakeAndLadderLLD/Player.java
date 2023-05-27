package SnakeAndLadderLLD;

public class Player {
    String id;
    int currentPos;

    public Player(String id, int currentPos) {
        this.id = id;
        this.currentPos = currentPos;
    }

    public String getId() {
        return id;
    }

    public int getCurrentPos() {
        return currentPos;
    }
}
