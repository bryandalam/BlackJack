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
        //initializes deck by going through loops and populates the deck based on int values connected to arrays in the Card class
        deck = new ArrayList<Card>();
        for(int a = 0; a <= 3; a++) {
            for(int b = 0; b <= 12; b++) {
                deck.add(new Card(a,b));
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
