package com.psl.gems.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PackOfCards {
private final List<Card> cards;
public PackOfCards() {
	cards=new ArrayList<>();
	for(Card.Suit suit:Card.Suit.values()) {
		for(Card.Rank rank:Card.Rank.values()) {
			cards.add(new Card(suit,rank));
		}
	}
}
public void shuffle() {
	Collections.shuffle(cards);
//	for(Card c:cards) {
//		System.out.println(c);
//	}
}
public Card getTopCard() {
	if(cards.isEmpty()) {
		throw new IllegalStateException("Pack of cards is empty");
	}
	return cards.remove(0);
}
public void addCard(Card card) {
	if(cards.contains(card)) {
		throw new IllegalArgumentException("Duplicate card: "+card);
	}
	cards.add(card);
}
public Card dealCard() {
    if (cards.isEmpty()) {
        throw new IllegalStateException("No more cards in the pack");
    }
    return cards.remove(0);
}

public Card getRandomCard() {
	if(cards.isEmpty()) {
		throw new IllegalStateException("Pack of Cards is empty");
	}
	int index=(int) (Math.random() * cards.size());
    return cards.remove(index);
}

public int getSize() {
	return cards.size();
}

public void reset(boolean ascending) {
	Collections.sort(cards,(c1,c2)->{
		int value1=c1.getValue();
		int value2=c2.getValue();
		if(ascending) {
			return Integer.compare(value1, value2);
		}else {
			return Integer.compare(value2,value1);
		}
	});
}
//public Card draw() {
//	// TODO Auto-generated method stub
//	return null;
//}


}
