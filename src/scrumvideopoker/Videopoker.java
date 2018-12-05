package scrumvideopoker;

import java.util.ArrayList;

public class Videopoker {
	
	ArrayList<Card> hand = new ArrayList<>();
	Deck d = new Deck();

	public void printHand() {
		for(int i = 0; i < hand.size(); i++) {
			System.out.println(hand.get(i).toString());
		}
	}
	
//	Lägger till 5 kort till starthanden
	public void starterHand() {
		d.shuffle();
		while (hand.size() < 5)  {
			hand.add(d.draw());
		}
	}
	
//	Holdar de kort som spelaren önskar. Dealar efter att önskade kort har holdats.
	public void holdAndDeal() {
		
	}

}
