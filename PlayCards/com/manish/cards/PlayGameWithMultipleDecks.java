import java.util.*;

class Card_Deck{
    int tot;
    Card card;
    Card_Deck(int tot, Card card){
        this.tot = tot;
        this.card = card;
    }
}
class PlayGameWithMultipleDecks extends MakeGame{
    int decks;
    int cardavailable = 52;
    Card_Deck[] deck = new Card_Deck[52];
    PlayGameWithMultipleDecks(int decks){
        super();
        for(int i=0; i<52; i++){
            deck[i] = new Card_Deck(0, cards[i]);
            //System.out.println(deck[i].card);
        }
        this.decks = decks;
    }
    Card distributeCards(){
        Random random = new Random();
        int rand = random.nextInt(cardavailable);
        //System.out.println(cardavailable+" "+decks);
        Card res = deck[rand].card;
        deck[rand].tot = deck[rand].tot+1;
        if(deck[rand].tot == decks){
            Card_Deck temp = deck[rand];
            deck[rand] = deck[cardavailable-1];
            deck[cardavailable-1] = temp;
            cardavailable--;
        }
        return res;
    }


    public static void main(String[] args){
        PlayGameWithMultipleDecks game = new PlayGameWithMultipleDecks(2);
        for(int i=0; i<104; i++)
            System.out.println(game.distributeCards());
    }

}