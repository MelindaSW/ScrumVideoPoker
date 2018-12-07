package scrumvideopoker;

import java.util.ArrayList;

public class PokerHand {
	
	
	public PokerHand() {
		
	}
	
	public String decidePokerHand(ArrayList<Card> hand) {

//			if (pair(hand)) {
//				return "Pair";
//			}
//			else if (twoPair(hand) == true) {
//				return "Two Pair";
//			}
//			else if (threeOfAKind(hand) == true) {
//				return "Three of a Kind";
//			}
//			else if (fourOfAKind(hand) == true) {
//				return "Four of a Kind";
//			}
			if (straight(hand)) {
				
				if (straightFlush(hand) == true) {
					return "Straight Flush";
				}
				else {
					return "Straight";
				}
			}
			else if (flush(hand)) {
				return "Flush";
			}
//			else if (fullHouse(hand) == true) {
//				return "Full House";
//			}
			else if (straightFlush(hand) == true) {
				return "Straight Flush";
			}
//			else if (royalFlush(hand) == true) {
//				return "Royal Straight Flush";
//			}
			else {
				return "No hand";
			}
		}
	
	
	
//	Att göra: lägg in algoritmer i metoderna som kollar om handarraylisten stämmer med villkoren för varje 
//	enskild poker hand. 
//	Metoderna nedan bör returnera true om det stämmer att Pokerhanden matchar. Returnera false om det inte stämmer. 
	
//	public boolean checkJacksOrBetterInPair() {
//		return true;
//	}
	
//	private boolean pair(ArrayList<Card> hand) {
//		Two cards of the same rank. 
//		Points only if jacks or better.

//		int equalCardCounter = 0;
		
//		for (Card card : hand) {
			
//			for (int i = 0; i < hand.size() - 1; i++) {
//				
//				if (hand.get(i).getValue() == hand.get(i).getValue()) {
//					equalCardCounter += 1;
//					return true;
					
//				}
//			}
//		}
//			if (equalCardCounter == 1) {
//				return true;
//			}
//			else {
//				return false;
//			}
//
//	}
	
//	private boolean twoPair(ArrayList<Card> hand) {
////		Two different pairs. 
//		
//		
//		return true;
//	}

//	
//	private boolean threeOfAKind(ArrayList<Card> hand) {
////	Three cards of the same rank. 
////		int equalCardCounter = 0;
////		
////		for (Card card : hand) {
////			
////			for (int i = 1; i < hand.size() - 1; i++) {
////				if (card.getValue() == hand.get(i).getValue()) {
////					equalCardCounter += 1;
////				}
////			}
////		}
////		
////			if (equalCardCounter == 3) {
//				return true;
////			}
////			else {
////				return false;
////			}
//			
//	}
	
//	private boolean fourOfAKind(ArrayList<Card> hand) {
////		Four cards of the same rank. 
////		int equalCardCounter = 0;
//		
////		for (Card card : hand) {
////			
////			for (int i = 1; i < hand.size() - 1; i++) {
////				if (card.getValue() == hand.get(i).getValue()) {
////					equalCardCounter += 1;
////				}
////			}
////		}
////		
////			if (equalCardCounter == 4) {
//				return true;
////			}
////			else {
////				return false;
////			}	
////	
//	}
//	
	private boolean straight(ArrayList<Card> hand) {
		
//		Five cards in a sequence, but not of the same suit. 
		if(hand.get(1).getValue() == hand.get(0).getValue() +1 
			&& hand.get(2).getValue() == hand.get(0).getValue() +2
			&& hand.get(3).getValue() == hand.get(0).getValue() +3
			&& hand.get(4).getValue() == hand.get(0).getValue() +4
			) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean flush(ArrayList<Card> hand) {
		
//		Any five cards of the same suit, but not in a sequence. 
		if (hand.get(0).getSuit() == hand.get(1).getSuit() 
			&& hand.get(0).getSuit() == hand.get(2).getSuit()
			&& hand.get(0).getSuit() == hand.get(3).getSuit()
			&& hand.get(0).getSuit() == hand.get(4).getSuit()) {
			return true;
		}
		else {
			return false;
		}
	}
//	
//	private boolean fullHouse(ArrayList<Card> hand) {
////		Three of a kind with a pair. 
//		return true;
//	}

	private boolean straightFlush(ArrayList<Card> hand) {
//		Five cards in a sequence, all in the same suit. 
		
		if (hand.get(1).getValue() == hand.get(0).getValue() +1 
				&& hand.get(2).getValue() == hand.get(0).getValue() +2
				&& hand.get(3).getValue() == hand.get(0).getValue() +3
				&& hand.get(4).getValue() == hand.get(0).getValue() +4
				
				&& hand.get(0).getSuit() == hand.get(1).getSuit() 
				&& hand.get(0).getSuit() == hand.get(2).getSuit()
				&& hand.get(0).getSuit() == hand.get(3).getSuit()
				&& hand.get(0).getSuit() == hand.get(4).getSuit()) {
			
			return true;
		}
		else {
			return false;
		}
	}
//	
//	private boolean royalFlush(ArrayList<Card> hand) {
////		A, K, Q, J, 10, all the same suit. 
//		return true;
//	}
//	
	
}
