package scrumvideopoker;


import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	ArrayList<Card> deck = new ArrayList<>();
	ArrayList<Card> hand = new ArrayList<>();
	
	public Deck() {
        //Här skapas totalt 52 kort men 12 av varje Suits.
		for (int i = 1; i < 14; i++) {
			this.deck.add(new Card(i, Suit.CLUBS));
			this.deck.add(new Card(i, Suit.HEARTS));
			this.deck.add(new Card(i, Suit.DIAMONDS));
			this.deck.add(new Card(i, Suit.SPADES));
		}
	}
	
    //Dra kortet från arraylisten med hjälp av en varibel i blackjack klassen som håller koll på vart vi är
	public Card draw(int i) {
	return this.deck.get(i);
	}
	
	// Här använder vi oss av en färdig klass och klassmetod Collections.shuffle
    // klassmetoden slumpar decken vi har skapat.
	public void shuffle() {
		Collections.shuffle(this.deck);
	}
	
//	Lägger till 5 kort till starthanden
	public void starterHand() {
		
	}
	
//	Holdar de kort som spelaren önskar. Dealar efter att önskade kort har holdats.
	public void holdAndDeal() {
		
	}
	
}
