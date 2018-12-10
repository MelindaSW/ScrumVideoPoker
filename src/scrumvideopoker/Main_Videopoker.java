package scrumvideopoker;

public class Main_Videopoker {

	public static void main(String[] args) {
		
		Deck d = new Deck();
		Videopoker v = new Videopoker(); 
		Card c = new Card();
		PokerHand ph = new PokerHand();
//		Videopoker v = new Videopoker(); 
//		v.fillHand1();
//		v.printHand1();
//		System.out.println();
//		v.holdAndDeal();
//		v.fillHand2();
//		
//		System.out.println("Refilled hand: ");
//		v.printHand2();
		
		String namn1 = "Adam";
		String namn2 = "Marcus";
		
		System.out.println(namn1.compareTo(namn2));
		
//		v.hand1.add(d.draw());
//
//		System.out.println(v.hand1.get(0).getSuit());
		//		System.out.println(d.deck.size());
//		v.fillHand1();
//		v.printHand1();
//		System.out.println();
//		v.holdAndDeal();
//		v.fillHand2();
//		System.out.println(d.deck.size());
//		
//		
//		
//		System.out.println("Refilled hand: ");
//		v.printHand2();
		

		System.out.println(ph.nSet);
		
//		d.printDeck();
	}
}
