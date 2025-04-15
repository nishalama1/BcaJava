package static_keyword;

public class Main {
   public static void main(String[] args) {
    PlayerA playerA= new PlayerA();
    playerA.startGame();
    System.out.println(Game.scrore);


    PlayerB playerb= new PlayerB();
    playerA.startGame();
    playerb.startGame();
    System.out.println(Game.scrore);
   } 
}
