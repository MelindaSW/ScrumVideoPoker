package scrumvideopoker;


public enum Suit {
	HEARTS ('\u2665'), SPADES ('\u2660'), DIAMONDS ('\u2666'), CLUBS ('\u2663');
	
	public final char symbol;
	
	Suit(char c) { 
		this.symbol = c;
	}
	
	public char getSymbol() {
		return symbol;
	}

}
