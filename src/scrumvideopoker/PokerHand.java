package scrumvideopoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;

public class PokerHand {
	
	Card c = new Card();
	
//	En navigableSet tar både bort dubletter och sorterar innehållet.
//	Används i sortHand metoden.
	NavigableSet<Integer> nSet;
	
	List<Integer> aList;
	
	public String getPokerHand(ArrayList<Card> hand) {

			if (evaluateHand(hand) == 4) {
				return "Pair";
			}
			else if (evaluateHand(hand) == 3) {
				return "Two Pair";
			}
			else if (evaluateHand(hand) == 3) {
				return "Three of a Kind";
			}
			else if (evaluateHand(hand) == 2) {
				return "Four of a Kind";
			}
			else if (straight(hand)) {
				
				if (straightFlush(hand)) {
					return "Straight Flush";
				}
				else {
					return "Straight";
				}
			}
			else if (flush(hand)) {
				return "Flush";
			}
			else if (evaluateHand(hand) == 2) {
				return "Full House";
			}
			else if (straightFlush(hand) == true) {
				return "Straight Flush";
			}
			else if (evaluateHand(hand) == 0) {
				return "Royal Flush";
			}
			else {
				return "No hand";
			}
		}
	
	
//	public boolean checkJacksOrBetterInPair() {
//		return true;
//	}
	
	
//	Sortera arrayen, gör om till HashSet. Jämför strl på hash set. 
//	Om 4 = 1par.
//	Om 3 = triss eller 2 par. 
//	Om 2 = fyrtal eller kåk.
//	Om 5 = Inget av det ovan. 
	
	
	private int evaluateHand(ArrayList<Card> hand) {
		
//		Two cards of the same rank. 
//		Points only if jacks or better.
		
		switch (sortHand(hand).size()) {
			case 4: return 4; 
			case 3: 
//		Lägg till if om triss eller 2 par
				
				return 3;
//				Lägg till if om fyrtal eller kåk
				
			case 2: return 2; 
			default: return 5; 
		}
		
	}

	
	private boolean straight(ArrayList<Card> hand) {
//		Sortera arrayen först! 
//		Five cards in a sequence, but not of the same suit. 
		List<Integer> s = sortHand(hand);
	
		int o = (int) s.get(0);
//		
		if(s.get(1).equals(o+1) && s.get(2).equals(o+2)
			&& s.get(3).equals(o+3) && s.get(4).equals(o+4)) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
	
	private boolean straightFlush(ArrayList<Card> hand) {
//		Five cards in a sequence, all in the same suit. 
		
//		List s = makeTreeSet(hand);
		List<Integer> s = sortHand(hand);
		
		int o = (int) s.get(0);
		
		if 	(s.get(1).equals(o+1) && s.get(2).equals(o+2)
				&& s.get(3).equals(o+3) && s.get(4).equals(o+4)
				&&hand.get(0).getSuit() == hand.get(1).getSuit() 
				&& hand.get(0).getSuit() == hand.get(2).getSuit()
				&& hand.get(0).getSuit() == hand.get(3).getSuit()
				&& hand.get(0).getSuit() == hand.get(4).getSuit()) {
			
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
	
	
	 List<Integer> sortHand(ArrayList<Card> hand) {
		
//		Ett TreeSet av typen NavigableSet:
		nSet = new TreeSet<>();
		
//		En ArrayList av typen List:
		aList = new ArrayList<>();
		
//		Innehållet i hand läggs till i ett set. Den både sorterar dem i storleksordning (descending)
//		samt tar bort dubletter och tripletter. 
//		Om inga dubletter finns så blir storleken densamma som från början.
		
		for(int i = 0; i < hand.size(); i++) {
			nSet.add(hand.get(i).getValue());
		}
		
//		Lägger till innehållet i den nu sorterade listan som metoden returnerar. 
		for (Integer i : nSet) {
			aList.add(i);
		}
		
		return aList;
		
	}
	
}
