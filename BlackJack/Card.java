
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    public int value;
    public String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
    public String suit;
    public String faces[] = {"King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3", "2", "Ace"};
    public String face;

    public Card(int fc, int st)
    {      
        suit = suits[st];
        face = faces[fc];
        if(face == "Jack" || face == "Queen" || face == "King") {
            value = 10;
        }
        else if(face == "Ace") {
            value = 11;
        }
        else {
            //sets numerical values from Strings to Ints
            value = Integer.parseInt(face);
        }
        
    }
    //gets card value
    public int getValue() {
        return this.value;
    }
    //gets face
    public String getFace() {
        return this.face;
    }
    //changes card value(used with Aces)
    public int setValue(int r) {
        return this.value = r;
    }
    //toString method
    public String toString() {
        return ("Face: " + getFace() + "\t" + "Value: " + getValue());
    }

    
}
