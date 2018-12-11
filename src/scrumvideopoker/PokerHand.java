package scrumvideopoker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class PokerHand {


	NavigableSet<Integer> nSet;

	List<Integer> aList;

	public String getPokerHand(ArrayList<Card> hand) {

		switch (evaluateHand(hand)) {

		case "Pair":
			return "Pair";

		case "Pair with Jacks or better":
			return "Pair with Jacks or better";

		case "Two pair":
			return "Two pair";

		case "Three of a kind":
			return "Three of a kind";

		case "Four of a kind":
			return "Four of a kind";

		case "Straight flush":
			return "Straight flush";

		case "Straight":
			return "Straight";

		case "Flush":
			return "Flush";

		case "Full house":
			return "Full house";

		case "Royal flush":
			return "Royal flush";

		case "No hand":
			return "No hand";
		}

		return "Something went wrong";
	}
	

//	Att göra: lägg in algoritmer i metoderna som kollar om handarraylisten stämmer med villkoren för varje 
//	enskild poker hand. 
//	Metoderna nedan bör returnera true om det stämmer att Pokerhanden matchar. Returnera false om det inte stämmer. 


	private String evaluateHand(ArrayList<Card> hand) {

//		Här får vi en ny sorterad lista med och borttagna dubletter baserat på innehållet i arraylistan. 
		List<Integer> s = sortHandAndRemoveDuplicates(hand);
		
//		Med hjälp av den nya listans storlek (s.size()) kan vi dra följande slutsats:
//		Om 4 = 1par.
//		Om 3 = triss eller 2 par. 
//		Om 2 = fyrtal eller kåk.
//		Om 5 = Inget av det ovan. = antingen no hand eller straight, straight flush eller royalFlush.
//		Om ingen hand matchar returneras "No hand"

//		Är storleken 4 så är det ett par det handlar om. 
//		Här kollas också om värdet på paret är jacks or better med hjälp av metoden längst ner i klassen. 
		switch(s.size()) {
		case 4:

			if (checkJacksOrBetterInPair(hand)) {

				return "Pair with Jacks or better";
				
			} else {

				return "Pair";
			}

//			Om storleken matchar med 3 kontrolleras först om det är tretal. Handen sorteras först. 
//			Tretalet kan då hamna i rad på tre olika positioner i listan, beroende på storleken.
//			Vi kollar om det mittersta kortet matchar med de två till höger, de två till vänster och 
//			till slut med de två på var sida om mitten. 
//			Om inget av detta stämmer så returneras istället 2 par. 
		case 3:

			Collections.sort(hand);

			if (   hand.get(2).getValue().equals(hand.get(3).getValue())
				&& hand.get(2).getValue().equals(hand.get(4).getValue())
				|| hand.get(2).getValue().equals(hand.get(1).getValue())
				&& hand.get(2).getValue().equals(hand.get(0).getValue())
				|| hand.get(2).getValue().equals(hand.get(1).getValue())
				&& hand.get(2).getValue().equals(hand.get(3).getValue())) {

				return "Three of a kind";
				
			} else {

				return "Two pair";
			}

//			Här gäller samma princip som för tretal. Med skillnaden att fyrtal bara har två möjliga 
//			positioner. Stämmer inte det med fyrtal så är det en kåk. 
		case 2:

			Collections.sort(hand);

			if (   hand.get(2).getValue().equals(hand.get(1).getValue())
				&& hand.get(2).getValue().equals(hand.get(3).getValue())
			    && hand.get(2).getValue().equals(hand.get(4).getValue())
				|| hand.get(2).getValue().equals(hand.get(0).getValue())
				&& hand.get(2).getValue().equals(hand.get(1).getValue())
				&& hand.get(2).getValue().equals(hand.get(3).getValue())) {

				return "Four of a kind";
			} else {

				return "Full house";
			}

//			Om storleken på listan är 5 kan vi dra slutsatsen att den består av nedan beskrivna poker hands.
//			Alternativet är också att handen inte har något värde alls = defaultvärdet.  

//			Här använder vi oss av den lista som vi får av metoden sortHandAndRemoveDuplicates()
//			Om värdet på plats 1, 2, 3, 4 stämmer överrens med det första värdet som adderas med 
//			1, 2. 3 respektive 4 så är det en stege. Om dessutom alla suits stämmer överrens med 
//			så är det en Straight flush. Och så vidare.

		case 5:

			int o = (int) s.get(0);

			if (   s.get(1).equals(o + 1) 
				&& s.get(2).equals(o + 2) 
			    && s.get(3).equals(o + 3) 
				&& s.get(4).equals(o + 4)
				&& hand.get(0).getSuit() == hand.get(1).getSuit() 
				&& hand.get(0).getSuit() == hand.get(2).getSuit()
				&& hand.get(0).getSuit() == hand.get(3).getSuit()
				&& hand.get(0).getSuit() == hand.get(4).getSuit()) {

				return "Straight flush";
				
			} else if (hand.get(0).getSuit() == hand.get(1).getSuit() 
					&& hand.get(0).getSuit() == hand.get(2).getSuit()
					&& hand.get(0).getSuit() == hand.get(3).getSuit() 
					&& hand.get(0).getSuit() == hand.get(4).getSuit()
					&& s.get(0).equals(1) 
					&& s.get(1).equals(10) 
					&& s.get(2).equals(11) 
					&& s.get(3).equals(12)
					&& s.get(4).equals(13)) {
				
				return "Royal flush";
				
			} else if (s.get(1).equals(o + 1) 
					&& s.get(2).equals(o + 2) 
					&& s.get(3).equals(o + 3)
					&& s.get(4).equals(o + 4)
					|| s.get(0).equals(1)
					&& s.get(1).equals(10)
					&& s.get(2).equals(11)
					&& s.get(3).equals(12)
					&& s.get(4).equals(13)) {

				return "Straight";
				
			} else if (hand.get(0).getSuit() == hand.get(1).getSuit() 
					&& hand.get(0).getSuit() == hand.get(2).getSuit()
					&& hand.get(0).getSuit() == hand.get(3).getSuit()
					&& hand.get(0).getSuit() == hand.get(4).getSuit()) {

				return "Flush";
			}

		default:
			return "No hand";
		}

	}

//	Metoden tar hand listan som parameter och returnerar en sorterad arraylist med dubletter/tripletter etc borttagna. 
	List<Integer> sortHandAndRemoveDuplicates(ArrayList<Card> hand) {

//		Ett TreeSet av typen NavigableSet:
		nSet = new TreeSet<>();

//		En ArrayList av typen List:
		aList = new ArrayList<>();

//		Innehållet i hand läggs till i ett set. Den både sorterar dem i storleksordning (minsta värdet först).
//		samt tar bort dubletter och tripletter. 
//		Om inga dubletter finns så blir storleken densamma som från början.

		for (int i = 0; i < hand.size(); i++) {
			nSet.add(hand.get(i).getValue());
		}

//		Lägger till innehållet i nSet i aList som metoden sen returnerar. 
		for (Integer i : nSet) {
			aList.add(i);
		}

		return aList;

	}

//	Metoden returnerar true om paret har värdet 11 eller mer. 
//	Först itererar den igenom handen till dess den kommer till de två korten 
//	som liknar varandra. Därefter kollar den om värdet på de två korten är högre än 
//	10 eller lika med 1 (ace). Om det stämmer så returneras true. Annars returneras false. 
	boolean checkJacksOrBetterInPair(ArrayList<Card> hand) {

		Collections.sort(hand);
		int count = 1;

		for (int i = 0; i < hand.size() - 1; i++) {

			if (hand.get(i).getValue() == hand.get(count).getValue()) {

				if (hand.get(count).getValue() >= 11 || hand.get(count).getValue() == 1) {

					return true;
				}
				count++;
			}
		}
		return false;
	}

}
