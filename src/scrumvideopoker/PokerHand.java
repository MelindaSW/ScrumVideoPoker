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
	
	private boolean pair(ArrayList<Card> hand) {
//		Two cards of the same rank. 
//		Points only if jacks or better.

		return true;
	}
	
	private boolean twoPair(ArrayList<Card> hand) {
//		Two different pairs. 
		return true;
	}

	
	private boolean threeOfAKind(ArrayList<Card> hand) {
//	Three cards of the same rank. 
		return true;
	}
	
	private boolean fourOfAKind(ArrayList<Card> hand) {
//		Four cards of the same rank. 
		return true;
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
