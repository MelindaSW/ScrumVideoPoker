package scrumvideopoker;


import java.util.ArrayList;


public class Videopoker {
	
	ArrayList<Card> hand1 = new ArrayList<>();
	ArrayList<Card> hand2 = new ArrayList<>();

	Deck d = new Deck();

	public void printHand1() {
		for(int i = 0; i < hand1.size(); i++) {
			System.out.println("Card " + (i + 1) + ": " + hand1.get(i).toString());
		}
	}
	
	public void printHand2() {
		for(int i = 0; i < hand2.size(); i++) {
			System.out.println("Card " + (i + 1) + ": " + hand2.get(i).toString());
		}
	}
	
//	Lägger till 5 kort till starthanden
	public void fillHand1() {
		d.shuffle();
		while (hand1.size() < 5)  {
			hand1.add(d.draw());
		}
	}

	public void fillHand2() {
		d.shuffle();
		while (hand2.size() < 5)  {
			hand2.add(d.draw());
		}
	}
	

//	Holdar de kort som spelaren önskar. Dealar efter att önskade kort har holdats.
	public void holdAndDeal(String in) {
		
//		Dela upp inputen med mellanslag som separator. 
		String[] separateInput = in.split(" ");
//		Parsa stringarrayen till en intarray
		Integer[] separatorInts;
		
		try {
		 separatorInts = new Integer[separateInput.length];
		
			for (int i = 0; i < separateInput.length; i++) {
				separatorInts[i] = Integer.parseInt(separateInput[i]);
			}

			for (Integer s : separatorInts) {
				hand2.add(hand1.get(s-1));
			}
		}
		catch (IndexOutOfBoundsException g) {
			System.out.println("Ett eller flera värden är för höga eller för låga.");
		}
		
	}
	
	
//	Förslag:
//	Använd den här metoden för att räkna ut score. Tar emot parametrar för vilken pokerhand 
//	samt vilken bet-nivå poängen ska baseras på
	public int score(String ph, int bet) {
		return 0;
	}
	

}
