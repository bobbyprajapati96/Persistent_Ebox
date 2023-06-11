package com.psl.gems.client;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private final String name;
	private final List<Card> cardInHand;

	public Player(String name) {
		this.name = name;
		this.cardInHand = new ArrayList<>();
	}
 public String getName() {
	 return name;
 }
 public List<Card> getCardsInHand() {
     return cardInHand;
 }

 public void addCardToHand(Card card) {
     cardInHand.add(card);
 }
 
 public Card getHighestCard() {
	 if(cardInHand.isEmpty()) {
		 throw new IllegalStateException("Player's hand is empty");
	 }
	 Card highestCard=cardInHand.get(0);
	 for(Card card :cardInHand) {
		 if(card.getValue()>highestCard.getValue()) {
			 highestCard=card;
		 }
	 }
	 return highestCard;
 }
}
