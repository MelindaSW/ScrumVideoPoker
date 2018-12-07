package scrumvideopoker;

public class Main_Videopoker {

	public static void main(String[] args) {
		
		Videopoker v = new Videopoker(); 
		//First Round
		v.fillHand1();
		v.printHand1();
		
		System.out.println();
		
		//Hold and deal then fill hand
		v.holdAndDeal();
		v.fillHand2();
		
		//Round 2
		System.out.println("Refilled hand: ");
		v.printHand2();
		
		
		

	}
}
