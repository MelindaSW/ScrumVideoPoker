package scrumvideopoker;


import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
        //Här skapas totalt 52 kort men 12 av varje Suits.
		for (int i = 1; i < 14; i++) {
			this.deck.add(new Card(i, Suit.CLUBS));
			this.deck.add(new Card(i, Suit.HEARTS));
			this.deck.add(new Card(i, Suit.DIAMONDS));
			this.deck.add(new Card(i, Suit.SPADES));
		}
	}
	
    // printDeck skriver ut hela kortleken	
	public void printDeck() {
		for(int i = 0; i < deck.size(); i++) {
//			shuffle();
			System.out.println(deck.get(i).toString());
		}
	}
	
    //Dra kortet från arraylisten med hjälp av en varibel i blackjack klassen som håller koll på vart vi är
	public Card draw() {
		Card card = deck.get(deck.size() - 1);
		deck.remove(deck.size() - 1);
		return card;
	}
	
	// Här använder vi oss av en färdig klass och klassmetod Collections.shuffle
    // klassmetoden slumpar decken vi har skapat.
	public void shuffle() {
		Collections.shuffle(this.deck);
	}
	
}
