package scrumvideopoker;

public class Main_Videopoker {

	public static void main(String[] args) {

		Deck d = new Deck();
		Card c = new Card();
		PokerHand ph = new PokerHand();
		Videopoker v = new Videopoker();

//		while (true) {
		v.fillHand1();
		v.printHand1();

		System.out.println();
		v.holdAndDeal();
		v.fillHand2();

		System.out.println("Refilled hand: ");
		v.printHand2();
		System.out.println();
		
	}
}
