import java.util.*;
class PlayGame extends MakeGame{
    int player;
    Player[] players;
    PlayGame(int player){
        super();
        this.player = player;
        players = new Player[player];
        while(player-- > 0){
            players[player] = new Player();
        }
    }
    void distributeCards(){
        int tot1 = cards.length - cards.length%player;
        Random rand = new Random();
        int i=0;
        while(tot1 > 0){
            int random = rand.nextInt(tot1);
            int tot = tot1-1;
            Card temp = cards[tot];
            cards[tot] = cards[random];
            cards[random] = temp;
            //System.out.println(i%player);
            players[i%player].addCards(cards[tot]);
            i++; 
            tot1--;
        }
        System.out.print(Arrays.toString(players));
    }


    public static void main(String[] args){
        PlayGame game = new PlayGame(4);
        game.distributeCards();
    }
}