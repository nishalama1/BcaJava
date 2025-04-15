package static_keyword;

public class PlayerA {
    PlayerA(){
        Game.scrore=-2;
    }
    void startGame(){
        Game game=new Game();
        game.increaseScore();
    }
}
