package scrumvideopoker;

import java.util.ArrayList;

public class PokerHand {

	
	
	public PokerHand() {
		
	}
	
	public String decidePokerHand(ArrayList<Card> hand) {

			if (pair(hand) == true) {
				return "Pair";
			}
			else if (twoPair(hand) == true) {
				return "Two Pair";
			}
			else if (threeOfAKind(hand) == true) {
				return "Three of a Kind";
			}
			else if (fourOfAKind(hand) == true) {
				return "Four of a Kind";
			}
			else if (straight(hand) == true) {
				return "Straight";
			}
			else if (flush(hand) == true) {
				return "Flush";
			}
			else if (fullHouse(hand) == true) {
				return "Full House";
			}
			else if (straightFlush(hand) == true) {
				return "Straight Flush";
			}
			else if (royalFlush(hand) == true) {
				return "Royal Straight Flush";
			}
			else {
				return "No hands";
			}
		}
	
	
	
//	Att göra: lägg in algoritmer i metoderna som kollar om handarraylisten stämmer med villkoren för varje 
//	enskild poker hand. 
//	Metoderna nedan bör returnera true om det stämmer att Pokerhanden matchar. Returnera false om det inte stämmer. 
	
	public boolean checkJacksOrBetterInPair() {
		return true;
	}
	
	private boolean pair(ArrayList<Card> hand) {
//		Two cards of the same rank. 
//		Points only if jacks or better.

		int equalCardCounter = 0;
		
		for (Card card : hand) {
			
			for (int i = 1; i < hand.size() - 1; i++) {
				if (card.getValue() == hand.get(i).getValue()) {
					equalCardCounter += 1;
				}
			}
		}
			if (equalCardCounter == 2) {
				return true;
			}
			else {
				return false;
			}

	}
	
//	
	private int equalsTest1(ArrayList<Card> hand) {
		int ecc1 = 0;
		if (par) {
			ecc1 = 2;
		}
		else if (triss) {
			ecc1 = 3;
		}
		else if (fyrtal) {
			ecc1 = 4;
		}
		else 
			ecc1 = 0;
		
		return ecc1;
	}
	
//	Exkludera kontrollerade kort och flytta över ej kontrollerade kort till newHand
	
	private int equalsTest2(ArrayList<Card> hand) {
		int ecc2 = 0;
		if (par) {
			ecc2 = 2;
		}
		else if (triss) {
			ecc2 = 3;
		}
		else
			ecc2 = 0;
		return ecc2;
	}
	
	private String equalsResult() {
		
		int ecc1 = this.equalsTest1();
		int ecc2 = this.equalsTest2();
		
		if (ecc1 == 2 && ecc2 == 0  ||  ecc1 == 0 && ecc2 == 2) {
			return "Par";
		}
		else if (ecc1 == 2  &&  ecc2 == 2) {
			return "Två par";
		}
		else if (ecc1 == 3 && ecc2 == 2  ||  ecc1 == 2 && ecc2 == 3) {
			return "Kåk";
		}
		else if (ecc1 == 4) {
			return "Fyrtal";
		}
		
	}
	
	private boolean twoPair(ArrayList<Card> hand) {
//		Two different pairs. 
		
		
		return true;
	}

	
	private boolean threeOfAKind(ArrayList<Card> hand) {
//	Three cards of the same rank. 
		int equalCardCounter = 0;
		
		for (Card card : hand) {
			
			for (int i = 1; i < hand.size() - 1; i++) {
				if (card.getValue() == hand.get(i).getValue()) {
					equalCardCounter += 1;
				}
			}
		}
		
			if (equalCardCounter == 3) {
				return true;
			}
			else {
				return false;
			}
			
	}
	
	private boolean fourOfAKind(ArrayList<Card> hand) {
//		Four cards of the same rank. 
		int equalCardCounter = 0;
		
		for (Card card : hand) {
			
			for (int i = 1; i < hand.size() - 1; i++) {
				if (card.getValue() == hand.get(i).getValue()) {
					equalCardCounter += 1;
				}
			}
		}
		
			if (equalCardCounter == 4) {
				return true;
			}
			else {
				return false;
			}	
	
	}
	
	private boolean straight(ArrayList<Card> hand) {
		
//		Five cards in a sequence, but not of the same suit. 
		return true;
	}
	
	private boolean flush(ArrayList<Card> hand) {
		
//		Any five cards of the same suit, but not in a sequence. 
		return true;
	}
	
	private boolean fullHouse(ArrayList<Card> hand) {
//		Three of a kind with a pair. 
		return true;
	}

	private boolean straightFlush(ArrayList<Card> hand) {
//		Five cards in a sequence, all in the same suit. 
		return true;
	}
	
	private boolean royalFlush(ArrayList<Card> hand) {
//		A, K, Q, J, 10, all the same suit. 
		return true;
	}
	
	
}
