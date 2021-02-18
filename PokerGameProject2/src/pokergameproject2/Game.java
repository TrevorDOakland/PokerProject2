/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokergameproject2;

/**
 *
 * @author TrevorDick
 */
import java.util.Scanner;

public class Game {

	// instance variables
	private Scanner input;
	private Player p1;
        private Computer p2;
	private boolean keepPlaying;

	// constructor
	public Game() {
		input = new Scanner(System.in);
		p1 = new Player();
		keepPlaying = true;
	}

	// method to deal the deck
	public void deal() {
		System.out.println();
		System.out.println("Here is your hand: ");
		p1.createHand();
		p1.sort();
		System.out.println(p1.showHand());
		System.out.println();
	}
        
        public void dealComputer() {
		System.out.println();
		System.out.println("Here is the computers hand: ");
		p2.createHand();
		p2.sort();
		System.out.println(p2.showHand());
		System.out.println();
	}
        
       /* public void bet(){
            int totalStack = 5;
            int MAX_BET = 1;
            int INTIAL_BET = 1;
            System.out.println();
            System.out.println("How Much Would you like to bet?: ");
            keepPlaying = input.nextBoolean();
            if(input.nextBoolean() == true){
                totalStack - MAX_BET;
                }
        }*/


	// method to evaluate the hand
	public String evaluate() {
		String evaluation = "";
		if (p1.isRoyalFlush() == true) {
			evaluation = "Royal Flush";
			return evaluation;
		}
		if (p1.isStraightFlush() == true) {
			evaluation = "Straight Flush";
			return evaluation;
		}
		if (p1.is4OfAKind() == true) {
			evaluation = "4 of a Kind";
			return evaluation;
		}
		 if (p1.isFullHouse() == true) {
			 evaluation = "Full House";
			 return evaluation;
		}
		if (p1.isFlush() == true) {
			evaluation = "Flush";
			return evaluation;
		}
		if (p1.isStraight() == true) {
			evaluation = "Straight";
			return evaluation;
		}
		if (p1.isTriple() == true) {
			evaluation = "3 of a Kind";
			return evaluation;
		}
		if (p1.is2Pair() == true) {
			evaluation = "2 Pair";
			return evaluation;
		}
		if (p1.is1Pair() == true) {
			evaluation = "1 Pair";
			return evaluation;
		}
		evaluation = "high card " + p1.highCard();
		return evaluation;
	}
        
        public String evaluateComputer() {
		String evaluation = "";
		if (p2.isRoyalFlush() == true) {
			evaluation = "Royal Flush";
			return evaluation;
		}
		if (p2.isStraightFlush() == true) {
			evaluation = "Straight Flush";
			return evaluation;
		}
		if (p2.is4OfAKind() == true) {
			evaluation = "4 of a Kind";
			return evaluation;
		}
		 if (p2.isFullHouse() == true) {
			 evaluation = "Full House";
			 return evaluation;
		}
		if (p2.isFlush() == true) {
			evaluation = "Flush";
			return evaluation;
		}
		if (p2.isStraight() == true) {
			evaluation = "Straight";
			return evaluation;
		}
		if (p2.isTriple() == true) {
			evaluation = "3 of a Kind";
			return evaluation;
		}
		if (p2.is2Pair() == true) {
			evaluation = "2 Pair";
			return evaluation;
		}
		if (p2.is1Pair() == true) {
			evaluation = "1 Pair";
			return evaluation;
		}
		evaluation = "high card " + p2.highCard();
		return evaluation;
	}

	 //method to play a game
	 //welcomes user, deals, evaluates, reports poker hand	
	public void playGame() {
		System.out.println();
		System.out.println("~~~Welcome to Poker!~~~");
		do {
			deal();
                        dealComputer();
                        //bet();
			System.out.println("You got " + evaluate() + "!");
                        System.out.println("You got " + evaluateComputer() + "!");
			System.out.println();
			System.out.println("Play again? true/false");
			keepPlaying = input.nextBoolean();
		} while (keepPlaying == true);
		System.out.println();
		System.out.println("~~~Thanks for playing!~~~");
		System.out.println();
	}

}