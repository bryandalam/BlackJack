import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    // instance variables - replace the example below with your own
    String winner;
    String name;
    ArrayList Players = new ArrayList<Player>();
    Scanner r = new Scanner(System.in);
    

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        Player playerone = new Player(5000, name);
        System.out.println("What is your name?");
        name = r.next();
        Player dealer = new Dealer(5000, "Dealer");
        play();
   
        
        
        
    }

    public void play() {
        playerone.hit();
        playerone.hit();
        dealer.hit();
        dealer.hit();
        
    }
    public void winner() {
    }
    public String endGame() {
        return winner;
    }
}
