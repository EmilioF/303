package ca.mcgill.cs.comp303.rummy.model;

import junit.framework.*;


public class TestCard extends TestCase
{
	public void testEquals()
	{
		Card pAcard = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
		Card pBcard = new Card(Card.Rank.ACE, Card.Suit.SPADES);
		Card pDcard = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
		Card pEcard = new Card(Card.Rank.TEN, Card.Suit.HEARTS);
		
		pAcard.equals(pDcard);
		pBcard.equals(pAcard);
		pDcard.equals(pEcard);
		
	}
	
	public void testCompareTo()
	{
		Card pAcard = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
		Card pBcard = new Card(Card.Rank.THREE, Card.Suit.SPADES);
		Card pDcard = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
		
		pAcard.compareTo(pDcard);
		pAcard.compareTo(pBcard);
	}
	public void testToStringAndHashCode()
	{
	
	Card pDcard = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
	
	String test = pDcard.toString();
	int hashCode = pDcard.hashCode();
	}
}