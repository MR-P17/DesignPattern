package ChessGameLLD;

public class Player {
    String playerId;
    Color color;
    boolean check;

    public Player(String playerId, Color color) {
        this.playerId = playerId;
        this.color = color;
        this.check = false;
    }

    public String getPlayerId() {
        return playerId;
    }

    public Color getColor() {
        return color;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }
}
