package com.psl.gems.client;

import java.util.Scanner;

public class TestClient {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Game game=new Game(2);
	Player player1=new Player("John");
	Player player2=new Player("Jane");
	game.registerPlayer(player1);
	game.registerPlayer(player2);
	System.out.println("Choose any operation");
	System.out.println("1)Shuffle Card\n2)Top Card\n3)Add Card");
	int choice=sc.nextInt();
if(choice==1) {
	PackOfCards pc=new PackOfCards();
	pc.shuffle();
	System.out.println("Card Shuffled");
}
	 game.play();
     // Deal cards to the players
//	 PackOfCards pc=new PackOfCards();
//     pc.dealCard();

     // Compare the highest cards of each player and declare the winner
//     Card win1 = player1.getHighestCard();
//     Card win=player2.getHighestCard();
//     if(win1.getValue()>win.getValue()) {
//    	 System.out.println("The winner is: " + player1.getName());
//     }
//     System.out.println("The winner is: " + player2.getName());
}
}
