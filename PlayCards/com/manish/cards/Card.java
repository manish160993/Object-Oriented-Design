
class Card{
    int val;
    SUITS suit;
    Card(int val, SUITS suit){
        this.val = val;
        this.suit = suit;   
    }

    public String toString(){
        return this.suit+" "+this.val;
    }
}