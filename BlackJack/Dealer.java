
/**
 * Write a description of class Dealer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dealer extends Player
{
    public Dealer(int Amt, String nm) {
        
    }
    
    public int hit(Deck deck) {
       if(handValue < 17) {
           hand.add(deck.deal());
        }
       return handValue;
    }

    
}
