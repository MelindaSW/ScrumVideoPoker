package scrumvideopoker;
public class Card {
	private int value;
	private Suit suit;

	//konstruktor för card klassen
	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	//Retunera värdet för krotet
	public int getValue() {
		return this.value;
	}
	
	//Retunera färgen för kortet
	public Suit getSuit() {
		return this.suit;

	}
}
