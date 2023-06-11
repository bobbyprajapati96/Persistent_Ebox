package com.psl.gems.client;

import java.util.*;

import java.util.Collections;
import java.util.List;

import com.psl.gems.client.Card.Suit;
import com.psl.gems.client.Card;

public class HandEvaluator {
//    public HandType evaluateHand(List<Card> cards) {
//        if (cards.size() != 5) {
//            throw new IllegalArgumentException("A hand must consist of exactly 5 cards");
//        }
//
//        Collections.sort(cards);
//
//        boolean isFlush = isFlush(cards);
//        boolean isStraight = isStraight(cards);
//        boolean isFullHouse= isFullHouse(cards);
//        if (isFlush && isStraight) {
//            if (cards.get(0).getValue() == 10) {
//                return HandType.ROYAL_FLUSH;
//            }
//            return HandType.STRAIGHT_FLUSH;
//        }
//
//        if (isFourOfAKind(cards)) {
//            return HandType.FOUR_OF_A_KIND;
//        }
//
//        if (isFullHouse(cards)) {
//            return HandType.FULL_HOUSE;
//        }
//
//        if (isFlush) {
//            return HandType.FLUSH;
//        }
//
//        if (isStraight) {
//            return HandType.STRAIGHT;
//        }
//
//        if (isThreeOfAKind(cards)) {
//            return HandType.THREE_OF_A_KIND;
//        }
//
//        if (isTwoPair(cards)) {
//            return HandType.TWO_PAIR;
//        }
//
//        if (isPair(cards)) {
//            return HandType.PAIR;
//        }
//
//        return HandType.HIGH_CARD;
//    }
//
//   
//
//	private boolean isFlush(List<Card> cards) {
//        Suit firstSuit = cards.get(0).getSuit();
//        for (int i = 1; i < 5; i++) {
//            if (cards.get(i).getSuit() != firstSuit) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private boolean isStraight(List<Card> cards) {
//        if (cards.get(0).getValue() == 2 && cards.get(1).getValue() == 3 && cards.get(2).getValue() == 4
//                && cards.get(3).getValue() == 5 && cards.get(4).getValue() == 14) {
//            return true;
//        }
//
//        for (int i = 0; i < 4; i++) {
//            if (cards.get(i + 1).getValue() - cards.get(i).getValue() != 1) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private boolean isFourOfAKind(List<Card> cards) {
//        if (cards.get(0).getValue() == cards.get(1).getValue()
//                && cards.get(1).getValue() == cards.get(2).getValue()
//                && cards.get(2).getValue() == cards.get(3).getValue()) {
//            return true;
//        }
//
//        if (cards.get(1).getValue() == cards.get(2).getValue() && cards.get(2).getValue() == cards.get(3).getValue()
//                && cards.get(3).getValue() == cards.get(4).getValue()) {
//            return true;
//        }
//
//        return false;
//    }
//    private boolean isFullHouse(List<Card> cards) {
//        Map<Integer, Integer> valueCounts = getValueCounts(cards);
//        return valueCounts.containsValue(3) && valueCounts.containsValue(2);
//    }
//
//    private boolean isThreeOfAKind(List<Card> cards) {
//        Map<Integer, Integer> valueCounts = getValueCounts(cards);
//        return valueCounts.containsValue(3);
//    }
//
//    private boolean isTwoPair(List<Card> cards) {
//        Map<Integer, Integer> valueCounts = getValueCounts(cards);
//        int numPairs = 0;
//        for (int count : valueCounts.values()) {
//            if (count == 2) {
//                numPairs++;
//            }
//        }
//        return numPairs == 2;
//    }
//
//    private boolean isPair(List<Card> cards) {
//        Map<Integer, Integer> valueCounts = getValueCounts(cards);
//        return valueCounts.containsValue(2);
//    }
//
//    private Map<Integer, Integer> getValueCounts(List<Card> cards) {
//        Map<Integer, Integer> valueCounts = new HashMap<>();
//        for (Card card : cards) {
//            int value = card.getValue();
//            valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
//        }
//        return valueCounts;
//    }
//}
	public HandType evaluateHand(List<Card> cards) {
		if (cards.size() != 3) {
			throw new IllegalArgumentException("A hand must consist of exactly 3 cards");
		}

		Collections.sort(cards);

		boolean isFlush = isFlush(cards);
		boolean isStraight = isStraight(cards);
		boolean isFullHouse = isFullHouse(cards);
		if (isFlush && isStraight) {
			if (cards.get(0).getValue() == 10) {
				return HandType.ROYAL_FLUSH;
			}
			return HandType.STRAIGHT_FLUSH;
		}

		if (isFourOfAKind(cards)) {
			return HandType.FOUR_OF_A_KIND;
		}

		if (isFullHouse(cards)) {
			return HandType.FULL_HOUSE;
		}

		if (isFlush) {
			return HandType.FLUSH;
		}

		if (isStraight) {
			return HandType.STRAIGHT;
		}

		if (isThreeOfAKind(cards)) {
			return HandType.THREE_OF_A_KIND;
		}

		if (isTwoPair(cards)) {
			return HandType.TWO_PAIR;
		}

		if (isPair(cards)) {
			return HandType.PAIR;
		}

		return HandType.HIGH_CARD;
	}

	private boolean isFlush(List<Card> cards) {
		Suit firstSuit = cards.get(0).getSuit();
		for (int i = 1; i < 3; i++) {
			if (cards.get(i).getSuit() != firstSuit) {
				return false;
			}
		}
		return true;
	}

	private boolean isStraight(List<Card> cards) {
		if (cards.get(0).getValue() == 2 && cards.get(1).getValue() == 3 && cards.get(2).getValue() == 4) {
			return true;
		}

		for (int i = 0; i < 3; i++) {
			if (cards.get(i + 1).getValue() - cards.get(i).getValue() != 1) {
				return false;
			}
		}
//		&& cards.get(3).getValue() == 5 && cards.get(4).getValue() == 14
		return true;
	}

	private boolean isFourOfAKind(List<Card> cards) {
		if (cards.get(0).getValue() == cards.get(1).getValue() && cards.get(1).getValue() == cards.get(2).getValue()
				&& cards.get(2).getValue() == cards.get(3).getValue()) {
			return true;
		}

		if (cards.get(1).getValue() == cards.get(2).getValue() && cards.get(2).getValue() == cards.get(3).getValue()
				&& cards.get(3).getValue() == cards.get(4).getValue()) {
			return true;
		}

		return false;
	}

	private boolean isFullHouse(List<Card> cards) {
		Map<Integer, Integer> valueCounts = getValueCounts(cards);
		return valueCounts.containsValue(3) && valueCounts.containsValue(2);
	}

	private boolean isThreeOfAKind(List<Card> cards) {
		Map<Integer, Integer> valueCounts = getValueCounts(cards);
		return valueCounts.containsValue(3);
	}

	private boolean isTwoPair(List<Card> cards) {
		Map<Integer, Integer> valueCounts = getValueCounts(cards);
		int numPairs = 0;
		for (int count : valueCounts.values()) {
			if (count == 2) {
				numPairs++;
			}
		}
		return numPairs == 2;
	}

	private boolean isPair(List<Card> cards) {
		Map<Integer, Integer> valueCounts = getValueCounts(cards);
		return valueCounts.containsValue(2);
	}

	private Map<Integer, Integer> getValueCounts(List<Card> cards) {
		Map<Integer, Integer> valueCounts = new HashMap<>();
		for (Card card : cards) {
			int value = card.getValue();
			valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
		}
		return valueCounts;
	}
}
