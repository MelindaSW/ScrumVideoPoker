package scrumvideopoker;


public class Card implements Comparable<Object> {
	
//	Klassen implementerar Comparable, vilket gör att dess objekt blir jämförbara med varandra. 
	
	private Integer value;
	private Suit suit;
	
	public Card() {
		
	}

	//konstruktor för card klassen
	public Card(Integer value, Suit suit) {
		this.value = value;
		this.suit = suit;
	}
	
	//Returnera värdet för kortet
	public Integer getValue() {
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

	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return getValue().compareTo(c.getValue());
	}

}
