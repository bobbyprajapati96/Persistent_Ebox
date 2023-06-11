package com.psl.gems.client;

public class Card implements Comparable<Card>{

	
	public Suit getSuit() {
		return suit;
	}
	@Override
	public String toString() {
		return  rank+" of "+suit;
	}
	public Rank getRank() {
		return rank;
	}
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	public enum Suit{
		CLUB,DIAMOND,HEART,SPADE
	}
	public enum Rank{
		 TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	}
	@Override
    public int compareTo(Card other) {
        return this.getValue() - other.getValue();
    }
	 public int getValue() {
	        return rank.ordinal() * 4 + suit.ordinal();
	    }
//	 public Card() {
//		this.suit = null;
//		this.rank = null;
//			
//			// TODO Auto-generated constructor stub
//		}
	private final Suit suit;
	private final Rank rank;
	
}
