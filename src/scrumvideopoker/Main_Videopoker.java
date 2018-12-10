package scrumvideopoker;

import java.util.Scanner;


public class Main_Videopoker {

	public static void main(String[] args) {
		
		Videopoker v = new Videopoker(); 
		PokerHand ph = new PokerHand();
		
		Scanner sc = new Scanner(System.in);

		boolean endGame = false;
		String input = "";			
		String in = "";

//		Startmeddelande med instruktioner:
		System.out.println("Welcome to video poker!\nWhen holding cards, enter card numbers (1-5),\nseparate numbers with space.\n"
				+ "If you don't want to hold any cards, simply enter any character or just press enter. \nGood luck!");
			
			while(!endGame) {
//				Om man vill starta ett spel, skriv Y. För att avsluta, skriv q. Det spelar ingen roll om det är stor eller liten bokstav.
				System.out.println("Start new game: Y, End game: Q");
				input = sc.next();
				
//				Om inputen inte stämmer med y eller q så utförs if satsen nedan och går in i loopen till dess att man skriver rätt.
				if (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("Q")){
					
					do{
						
						System.out.println("Wrong input, write Y or Q!\n");
						input = sc.next();
					}
					while (!input.equalsIgnoreCase("Y") && !input.equalsIgnoreCase("Q"));
				
				}

//				Om y startar spelet. 
				if (input.equalsIgnoreCase("Y")) {
					
					v.fillHand1();
					v.printHand1();
					
//					Om man inte vill holda något kort och bara trycker enter så fångar catch upp detta och 
//					helt enkelt skriver ut en ny hand. 
					try {
						
					System.out.println("Which cards do you want to hold?");
					
					in = sc.nextLine();
					sc.nextLine();

					v.holdAndDeal(in);
					v.fillHand2();
					v.printHand2();
					System.out.println();					
					System.out.println("\nYou've got: " + ph.getPokerHand(v.hand2) + "\n");
					
					}
					
					catch (NumberFormatException a) {

						v.fillHand2();
						v.printHand2();
						System.out.println("\nYou've got: " + ph.getPokerHand(v.hand2) + "\n");
					}
				}

				
//				Om q så sätts boolean endGame till true och while loopen avslutas. 				
				else if(input.equalsIgnoreCase("Q")) {
					
					endGame = true;
					
				}
//				Rensa händerna på innehåll innan ett nytt spel börjar:
				v.hand1.clear();
				v.hand2.clear();
			}
			
//			När while loopen avslutas så avslutas spelet här.
			System.out.println("End of game. Welcome back!");
			sc.close();
			System.exit(0);	
		
	}
}
