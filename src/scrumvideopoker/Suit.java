package scrumvideopoker;


public enum Suit {
	HEARTS ('\u2665'), SPADES ('\u2660'), DIAMONDS ('\u2666'), CLUBS ('\u2663');
	
	public final char symbol;
	
<<<<<<< HEAD
	Suit(char c) { 
		this.symbol = c;
=======
	Suit(char symbol) {
		this.symbol = symbol;
>>>>>>> e6a48cab36e247347d9527ad6ec166ecb2fead28
	}
	
	public char getSymbol() {
		return symbol;
	}

}
