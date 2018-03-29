import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player 
{
    public int MoneyAmnt;
    public ArrayList<Card> hand = new ArrayList<Card>();
    public int hitNum;
    public String Playername;
    public int handValue;
    public int bet;
    Scanner scan = new Scanner(System.in);
    

    /**
     * Constructor for objects of class Player
     */
    public Player(int Amt, String nm) 
    {
        // initialise instance variables
        this.MoneyAmnt = Amt;
        this.Playername = nm;
    }
    
    public int bet() {
        System.out.println("How much would you like to bet?");
        bet = scan.nextInt();
        MoneyAmnt = MoneyAmnt - bet;
        System.out.println("This is how much money you have left: " + this.MoneyAmnt + " And this is your bet: " + this.bet + ".");
        return MoneyAmnt;
    }
    
    public ArrayList hit(Deck deck) {
        hand.add(deck.deal());
        return hand;
        
        
    }
    
    public int calculateHand() {
        for(Card object : hand) {
            if (object.getFace() == "Ace") {
                if((handValue += 11) < 21) {
                    object.setValue(1);
                }
                else {
                    object.setValue(11);
                }
        }
        handValue += object.getValue();
      }
      return handValue;
    }
    

        
            

    
}
