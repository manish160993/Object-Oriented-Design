import java.util.*;

class Player{
    List<Card> list;
    Player(){
        list = new ArrayList();
    }
    void addCards(Card card){
        list.add(card);
    }
    public String toString(){
        return list.toString();
    }
}