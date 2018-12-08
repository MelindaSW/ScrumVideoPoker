package scrumvideopoker;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;



public class VideopokerJUnitTestClass  {
	
	Deck d;
	ArrayList<Card> testArray;
	
	PokerHand ph = new PokerHand(); 
	
	
	@BeforeEach
	public void startingTest(TestInfo testinfo) {
		d = new Deck();
		ph = new PokerHand();
		testArray = new ArrayList<>();
		System.out.println("Starting: " + testinfo.getDisplayName());

	}

	@AfterEach
	public void finishedTest(TestInfo testinfo) {
		System.out.println("Finishing: " + testinfo.getDisplayName());
	}
	
	@Test
	public void testSizeOfStarterHand() {
		assertEquals(52, d.deck.size());
	}

	
	@Test
	public void testIfPair() {

		testArray.clear();

		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(6, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(1, Suit.HEARTS));
		
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Pair", ph.getPokerHand(testArray));
	}
	
	
	@Test
	public void testIfTwoPair() {
		
		testArray.clear();

		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(5, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(1, Suit.HEARTS));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Two Pair", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfThreeOfAKind() {
		
		testArray.clear();

		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(13, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(1, Suit.HEARTS));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Three of a Kind", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfFourOfAKind() {
		
		testArray.clear();
		
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(13, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(13, Suit.SPADES));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Four of a Kind", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfStraight() {
		
		testArray.clear();

		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(5, Suit.DIAMONDS));
		testArray.add(new Card(8, Suit.HEARTS));
		testArray.add(new Card(7, Suit.CLUBS));
		testArray.add(new Card(9, Suit.HEARTS));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Straight", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfFlush() {
		
		testArray.clear();
		
		testArray.add(new Card(5, Suit.HEARTS));
		testArray.add(new Card(2, Suit.HEARTS));
		testArray.add(new Card(7, Suit.HEARTS));
		testArray.add(new Card(8, Suit.HEARTS));
		testArray.add(new Card(9, Suit.HEARTS));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Flush", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfFullHouse() {
		
		testArray.clear();

		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(13, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(5, Suit.HEARTS));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Full House", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfStraightFlush() {
		
		testArray.clear();
		
		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(7, Suit.CLUBS));
		testArray.add(new Card(9, Suit.CLUBS));
		testArray.add(new Card(8, Suit.CLUBS));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Straight Flush", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfRoyalFlush() {
		
		testArray.clear();
		
		testArray.add(new Card(10, Suit.CLUBS));
		testArray.add(new Card(11, Suit.CLUBS));
		testArray.add(new Card(12, Suit.CLUBS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(1, Suit.CLUBS));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Royal Flush", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testMakeTreeSetMethor() {
		testArray.clear();
		
		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(8, Suit.CLUBS));
		testArray.add(new Card(8, Suit.CLUBS));
		testArray.add(new Card(9, Suit.CLUBS));
		testArray.add(new Card(1, Suit.CLUBS));
		
		System.out.println("TreeSet:");
		for (Integer n : ph.sortHand(testArray)) {
			System.out.println(n);
		}
		assertTrue(ph.sortHand(testArray).size() == 4);
	}

	
}










