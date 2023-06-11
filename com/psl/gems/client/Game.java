package com.psl.gems.client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
 

    
	private final List<Player> players;
    private final PackOfCards packOfCards;
    private final HandEvaluator handEvaluator;

    public Game(int numberOfPlayers) {
        if (numberOfPlayers < 2 || numberOfPlayers > 8) {
            throw new IllegalArgumentException("Number of players should be between 2 and 8");
        }
        this.players = new ArrayList<>();
//        for (int i = 1; i <= numberOfPlayers; i++) {
//            players.add(new Player("Player " + i));
//        }
        this.packOfCards = new PackOfCards();
        this.handEvaluator = new HandEvaluator();
    }
    public void registerPlayer(Player p) {
        players.add(p);
    }
    public void play() {
        // Shuffle the cards
        packOfCards.shuffle();

        // Deal cards to players
        for (int i = 0; i < 3; i++) {
            for (Player player : players) {
                Card card = packOfCards.dealCard();
                player.addCardToHand(card);
            }
        }

        // Evaluate hands and determine the winner
        Player winner = null;
        HandType winningHandType = null;
        for (Player player : players) {
            HandType handType = handEvaluator.evaluateHand(player.getCardsInHand());
            if (winningHandType == null || handType.compareTo(winningHandType) > 0) {
                winner = player;
                winningHandType = handType;
            }
        }
  
        // Print out the hands and the winner
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand: " + player.getCardsInHand());
        }
		//        Card c=new Card();;
        System.out.println("Winner: "+winner.getName() + " with a " + winningHandType);
    }
    }