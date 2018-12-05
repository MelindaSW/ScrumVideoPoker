package scrumvideopoker;

public class Main_Videopoker {

	public static void main(String[] args) {
		Videopoker v = new Videopoker(); 
		v.fillHand1();
		v.printHand1();
		System.out.println();
		v.holdAndDeal();
		v.fillHand2();
		v.printHand2();
//		d.printDeck();
	}
}
