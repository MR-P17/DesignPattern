package TicTacToeLLD;

public class Player {
    String id;
    PlayingPiece playingPiece;

    public Player(String id, PlayingPiece playingPiece){
        this.id = id;
        this.playingPiece = playingPiece;
    }

    public String getId() {
        return id;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }
}
