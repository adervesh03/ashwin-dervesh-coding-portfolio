import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeckRunner {

	public static void main(String[] args) {
//		ArrayList<String> suits = new ArrayList<String>();
//		suits.add("hearts");
//		suits.add("diamonds");
//		suits.add("spades");
//		suits.add("clubs");
//		
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("ace");
//		names.add("2");
//		names.add("3");
//		names.add("4");
//		names.add("5");
//		names.add("6");
//		names.add("7");
//		names.add("8");
//		names.add("9");
//		names.add("10");
//		names.add("jack");
//		names.add("queen");
//		names.add("king");
//		
//		ArrayList<Integer> values = new ArrayList<Integer>();
//		values.add(1);
//		values.add(2);
//		values.add(3);
//		values.add(4);
//		values.add(5);
//		values.add(6);
//		values.add(7);
//		values.add(8);
//		values.add(9);
//		values.add(10);
//		values.add(11);
//		values.add(12);
//		values.add(13);
//		
//		DeckOfCards normalDeck = new DeckOfCards(suits, names, values);
//
//		System.out.println(normalDeck.dealCard());
//		System.out.println();
//		
//		normalDeck.allCards();
//		System.out.println();
//		
//		normalDeck.shuffleDeck();
//		normalDeck.allCards();
//		
		ArrayList<String> suits = new ArrayList<String>();
		suits.add("dolphins");
		suits.add("whales");
		suits.add("sharks");
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("ace");
		names.add("2");
		names.add("3");
		names.add("4");
		names.add("5");
		names.add("king");
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(10);

		
		DeckOfCards normalDeck = new DeckOfCards(suits, names, values);

		System.out.println(normalDeck.dealCard());
		System.out.println();
		
		normalDeck.allCards();
		System.out.println();
		
		normalDeck.shuffleDeck();
		normalDeck.allCards();
	}

}
