package scrumvideopoker;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.AfterAll;
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
		System.out.println("Finished: " + testinfo.getDisplayName());
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
		testArray.add(new Card(10, Suit.HEARTS));
		testArray.add(new Card(1, Suit.CLUBS));
		testArray.add(new Card(10, Suit.HEARTS));
		
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
		assertEquals("Two pair", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfThreeOfAKind() {
		
		testArray.clear();

		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(13, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(1, Suit.CLUBS));
		testArray.add(new Card(13, Suit.SPADES));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Three of a kind", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testIfFourOfAKind() {
		
		testArray.clear();
		
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(13, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(13, Suit.SPADES));
		
		System.out.println(ph.getPokerHand(testArray));
		assertEquals("Four of a kind", ph.getPokerHand(testArray));
		
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
		PokerHand pk = new PokerHand();
		testArray = new ArrayList<>();
		
		testArray.clear();
		
		testArray.add(new Card(5, Suit.HEARTS));
		testArray.add(new Card(6, Suit.HEARTS));
		testArray.add(new Card(4, Suit.HEARTS));
		testArray.add(new Card(8, Suit.HEARTS));
		testArray.add(new Card(9, Suit.HEARTS));
		
//		assertEquals("Flush",ph.decidePokerHand(testArray));
		
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
		assertEquals("Full house", ph.getPokerHand(testArray));
		
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
		assertEquals("Straight flush", ph.getPokerHand(testArray));
		
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
		assertEquals("Royal flush", ph.getPokerHand(testArray));
		
	}
	
	@Test
	public void testSortHandAndRemoveDuplicatesMethod() {
		testArray.clear();
		
		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(8, Suit.CLUBS));
		testArray.add(new Card(8, Suit.HEARTS));
		testArray.add(new Card(9, Suit.CLUBS));
		testArray.add(new Card(1, Suit.CLUBS));
		
		System.out.println("TreeSet:");
		for (Integer n : ph.sortHandAndRemoveDuplicates(testArray)) {
			System.out.println(n);
		}
		assertTrue(ph.sortHandAndRemoveDuplicates(testArray).size() == 4);
	}

	@Test
	public void testSort() {
		
		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(8, Suit.HEARTS));
		testArray.add(new Card(8, Suit.CLUBS));
		testArray.add(new Card(9, Suit.SPADES));
		testArray.add(new Card(1, Suit.CLUBS));

		Collections.sort(testArray);
		System.out.println();
		for (Card c : testArray)
		System.out.println(c);
		System.out.println();
	}
	
	@Test
	public void testTrueJacksOrBetterMethod() {
	
		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(11, Suit.HEARTS));
		testArray.add(new Card(11, Suit.CLUBS));
		testArray.add(new Card(9, Suit.SPADES));
		testArray.add(new Card(1, Suit.CLUBS));
		
		assertTrue(ph.checkJacksOrBetterInPair(testArray));
	}
	
	@Test
	public void testFalseJacksOrBetterMethod() {
	
		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(10, Suit.HEARTS));
		testArray.add(new Card(1, Suit.CLUBS));
		testArray.add(new Card(9, Suit.SPADES));
		testArray.add(new Card(10, Suit.CLUBS));
		
		assertFalse(ph.checkJacksOrBetterInPair(testArray));
	}
}










