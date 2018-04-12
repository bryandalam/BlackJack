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
    Scanner r = new Scanner(System.in);
    Deck gameDeck = new Deck();
    Player dealer = new Player(5000, "Dealer");
    Player playerone = new Player(5000, name);
    String hitorstay;
    int betAmnt;

    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        System.out.println("What is your name?");
        name = r.next();
        play();
    }
    //plays the game

    public void play() {
        //player inputs bet
        System.out.println("How much do you want to bet?");
        betAmnt = r.nextInt();
        playerone.bet(betAmnt);
        //deals initial cards
        dealCards(playerone);
        dealCards(dealer);
        //player one goes
        System.out.println("Your cards are: " + playerone.showHand() + ". " + "Your hand equals: " + playerone.calculateHand() + ". "+ name + " would you like to hit?(y/n)");
        hitorstay = r.next();
        playerTurn();
        }
    //deals two cards off the start to the two players
    public void dealCards(Player p) {
        p.hit(gameDeck);
        p.hit(gameDeck);
    }
    //the player goes
    public void playerTurn() {
        if(hitorstay.equals("n")) {
            dealerTurn();
        }
        while(hitorstay.equals("y")) {
           playerone.hit(gameDeck);
           System.out.println("Your cards are: " + playerone.showHand() + ". " + "Your hand equals: " + playerone.calculateHand() + ". "+ name + " would you like to hit or stay?(y/n)");
           hitorstay = r.next();
           if(hitorstay.equals("n")) {
               dealerTurn();
            }
        }
        
    }
    //basically stays for the player and moves to the dealer for their turn. The dealer is forced to hit until greater than or equal to 17
    public void dealerTurn() {
        System.out.println("The Dealer's cards are: " + dealer.showHand() + ". " + "The Dealer's hand equals: " + dealer.calculateHand());
        while (dealer.calculateHand() < 17) {
            dealer.hit(gameDeck);
            System.out.println("The Dealer's cards are: " + dealer.showHand() + ". " + "The Dealer's hand equals: " + dealer.calculateHand());
        }
        //kicks to winner once the dealer is forced to stay
        winner();
    }
    //determines the winner based on card numbers and if cards are greater than other player's cards. Works with bets to change amount of money player has
    public void winner() {
        if(playerone.calculateHand() > dealer.calculateHand() && playerone.calculateHand() <= 21) {
            winner = name;
            playerone.changeMoney(betAmnt * 2);
            endGame();
        }
        if(dealer.calculateHand() > playerone.calculateHand() && dealer.calculateHand() <= 21) {
            winner = "dealer";
            playerone.changeMoney(betAmnt * -2);
            endGame();
        }
        
    }
    //ends the game by returning the winner
    public String endGame() {
        System.out.println("The winner is: " + winner);
        return winner;
    }
}
