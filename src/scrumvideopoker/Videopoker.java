package scrumvideopoker;


import java.util.ArrayList;
import java.util.Scanner;


public class Videopoker {
	
	ArrayList<Card> hand = new ArrayList<>();
	ArrayList<Card> hand2 = new ArrayList<>();

	Deck d = new Deck();

	public void printHand() {
		for(int i = 0; i < hand.size(); i++) {
			System.out.println(hand.get(i).toString());
		}
	}
	
//	Lägger till 5 kort till starthanden
	public void starterHand() {
		d = new Deck();
		d.shuffle();
		while (hand.size() < 5)  {
			hand.add(d.draw());
		}
	}
	
//	Holdar de kort som spelaren önskar. Dealar efter att önskade kort har holdats.
//	@SuppressWarnings("null")
	public void holdAndDeal() {

		
		
		
		
		
		
		
//		Förslag på lösning: / Melinda
//		Scanner sc  = new Scanner(System.in);
//		String input = sc.nextLine();
//		
//		String[] separateInput = input.split(" ");
//		
////		Parsa stringarrayen till en intarray
//		int[] separatorInts = null;
//		
//		try {
//			for (int i = 0; i < separateInput.length - 1; i++) {
//					separatorInts[i] = Integer.parseInt(separateInput[i]);
//				}
//		}
//		catch (NumberFormatException e) {
//			System.out.println("Ogiltigt värde i inputen.");
//		}
//		
//		for (int s : separatorInts) {
//			Card card = hand.get(s);
//			hand2.add(card);
//		}
	}

	

}
