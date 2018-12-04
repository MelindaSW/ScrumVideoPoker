package scrumvideopoker;
public class Card {
	private int value;
	private Suit suit;

	//konstruktor för card klassen
	public Card(int value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	//Returnera värdet för kortet
	public int getValue() {
		return this.value;
	}
	
	//Returnera färgen för kortet
	public Suit getSuit() {
		return this.suit;
	}
	
	@Override
	public String toString() {
		
		if(getValue() == 11) {
			return "J " + getSuit().getSymbol();
		}
		else if(getValue() == 12) {
			return "Q " + getSuit().getSymbol();
		}
		else if(getValue() == 13) {
			return "K " + getSuit().getSymbol();
		}
		else if(getValue() == 1) {
			return "A " + getSuit().getSymbol();
		}
		return this.getValue() + " " + this.suit.getSymbol();
	}
}
