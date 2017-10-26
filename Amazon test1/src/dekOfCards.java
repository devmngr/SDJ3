public enum Rank {TWO,THREE,"4","5","6","7","8","9","10","ACE","j","Q","K"}
public enum Type {HARTS,DIMONDS,SPADES,CLUBS}

public class Card{
    
    private Rank rank;
    private Type type;
    
    
    public Card(Rank rank,Type type){
        this.rank = rank;
        this.type = type;
        
    }
    
    public Rank getRank(){
        return rank;
    }
    
    public Type getType(){
        return type;
    }

    
}


for (Rank rank :  Rank.values())

public class CardDeck{
    
    private ArrayList<Card> cards;
    
    public CardDeck(){
        cards = new ArrayList<Card>();
        for(Rank rank : Rank.values()){
            for(Type type : Type.value())
                {
                     cards.add(new Card(rank,type))
                }
        }
    }
    
    
    
    public Card getCard(){
        Card temp = cards.remove(0);
        return temp;
    }
    
    

    
    
    
    
    
    
    
    
    
    
}
