package scrumvideopoker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class VideopokerJUnitTestClass {
	
	Deck deck;
	ArrayList<Card> testArray;
	PokerHand ph = new PokerHand();
	
	@Test
	public void test() {
		
	}
	
	@BeforeEach
	public void newDeck() {
		deck = new Deck();
	}
	
	@BeforeEach
	public void currentTest() {
		
	}
	
	@Test
	public void testSizeOfStarterHand() {
		
	}

	
	
	@Test
	public void testIfPair() {
		
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(6, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(1, Suit.HEARTS));
		
		assertEquals("Pair", ph.decidePokerHand(testArray));
	}
	
	
	@Test
	public void testIfTwoPair() {
		
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(5, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(1, Suit.HEARTS));
		
		assertEquals("Two Pair", ph.decidePokerHand(testArray));
		
	}
	
	@Test
	public void testIfThreeOfAKind() {
		
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(13, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(1, Suit.HEARTS));
		
		assertEquals("Three of a Kind", ph.decidePokerHand(testArray));
		
	}
	
	@Test
	public void testIfFourOfAKind() {
		
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(13, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(13, Suit.SPADES));
		
		assertEquals("Four of a Kind", ph.decidePokerHand(testArray));
		
	}
	
	@Test
	public void testIfStraight() {
		
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(6, Suit.DIAMONDS));
		testArray.add(new Card(7, Suit.HEARTS));
		testArray.add(new Card(8, Suit.CLUBS));
		testArray.add(new Card(9, Suit.HEARTS));
		
		assertEquals("Straight", ph.decidePokerHand(testArray));
		
	}
	
	@Test
	public void testIfFlush() {
		
		testArray.add(new Card(5, Suit.HEARTS));
		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(7, Suit.HEARTS));
		testArray.add(new Card(8, Suit.DIAMONDS));
		testArray.add(new Card(9, Suit.CLUBS));
		
		assertEquals("Flush", ph.decidePokerHand(testArray));
		
	}
	
	@Test
	public void testIfFullHouse() {
		
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(13, Suit.DIAMONDS));
		testArray.add(new Card(13, Suit.HEARTS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(5, Suit.HEARTS));
		
		assertEquals("Full House", ph.decidePokerHand(testArray));
		
	}
	
	@Test
	public void testIfStraightFlush() {
		
		testArray.add(new Card(5, Suit.CLUBS));
		testArray.add(new Card(6, Suit.CLUBS));
		testArray.add(new Card(7, Suit.CLUBS));
		testArray.add(new Card(8, Suit.CLUBS));
		testArray.add(new Card(9, Suit.CLUBS));
		
		assertEquals("Straight Flush", ph.decidePokerHand(testArray));
		
	}
	
	@Test
	public void testIfRoyalFlush() {
		
		testArray.add(new Card(10, Suit.CLUBS));
		testArray.add(new Card(11, Suit.CLUBS));
		testArray.add(new Card(12, Suit.CLUBS));
		testArray.add(new Card(13, Suit.CLUBS));
		testArray.add(new Card(1, Suit.CLUBS));
		
		assertEquals("Royal Flush", ph.decidePokerHand(testArray));
		
	}
	
	
	
}










