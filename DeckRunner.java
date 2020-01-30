import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeckRunner {

	public static void main(String[] args) {
//		String[] suits = {"hearts", "diamonds", "spades", "clubs"};
//		
//		String[] ranks = {"ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
//		
//		int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
//		
//		Deck normalDeck = new Deck(suits, ranks, values);
//		System.out.println(normalDeck.size());
//		
//		System.out.println(normalDeck.deal());
//		System.out.println();
//		
//		System.out.println(normalDeck);
//		System.out.println();
//		
//		normalDeck.shuffle();
//		
//		
//		while (!normalDeck.isEmpty()) {
//			normalDeck.deal();
//		}
//		
//		System.out.println(normalDeck);
//		
//		System.out.println(normalDeck.size());
//		
		String[] suits = {"dolphins", "whales", "sharks"};
		
		String[] ranks = {"ace", "2", "3", "4", "5", "king"};
		
		int[] values = {1, 2, 3, 4, 5, 10};

		
		Deck normalDeck = new Deck(suits, ranks, values);
		System.out.println(normalDeck.size());
		
		System.out.println(normalDeck.deal());
		System.out.println();
		
		System.out.println(normalDeck);
		System.out.println();
		
		normalDeck.shuffle();
		
		
		while (!normalDeck.isEmpty()) {
			normalDeck.deal();
		}
		
		System.out.println(normalDeck);
		
		System.out.println(normalDeck.size());
	}

}
