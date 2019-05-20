class MakeGame{
    Card[] cards;
    MakeGame(){
        cards = new Card[52];
        int j=0;
        for (SUITS suit : SUITS.values()) {
            for(int i=1; i<=13; i++){
                cards[j++] = new Card(i, suit);
            }
        }
    }
}