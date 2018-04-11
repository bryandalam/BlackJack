
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    public int value;
    public String suit;
    public String face;

    public Card(String fc, String st)
    {      
        this.suit = st;
        this.face = fc;
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
        return ("Face: " + getFace() + " " + "Value: " + getValue());
    }

    
}
