package static_keyword;

public class PlayerB {
    PlayerB(){
        Game.scrore=+10;
    }
    void startGame(){
        Game game=new Game();
        game.increaseScore();
    }
}
