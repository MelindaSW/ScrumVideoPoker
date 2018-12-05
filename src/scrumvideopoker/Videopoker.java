package scrumvideopoker;

import java.util.ArrayList;
import java.util.Scanner;

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
	public void holdAndDeal() {
		System.out.println("Which cards do you want to hold?");
		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine();
//		String[] separator = input.split(" ");
		boolean done = false;
		while(!done) {
			if (sc.nextInt() == 0) {
				done = true;
			}
			System.out.println("Hej");
			Card card = hand1.get(sc.nextInt() - 1);
			hand2.add(card);
			

				
		}
		System.out.println("Hejdå");

		
		
	}

}
