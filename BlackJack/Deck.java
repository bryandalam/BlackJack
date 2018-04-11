import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Deck
{
    public ArrayList<Card> deck = new ArrayList<Card>();
    
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
        };

        String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
        };

        // initialize deck
        
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                deck.add(new Card(RANKS[i],SUITS[j]));
            }
        }

       
        shuffle();
    }
    //shuffles the deck
    public void shuffle() {
        Collections.shuffle(deck);
    }
    //deals the deck
    public Card deal() {
        return deck.remove(0);
        
    }

    
}
