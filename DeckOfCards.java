import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards {
	private ArrayList<Card> deck;
	
	public DeckOfCards(ArrayList<String> suit, ArrayList<String> name, ArrayList<Integer> value) {
		deck = new ArrayList<Card>();
		for (String s: suit) {
			for (int i = 0; i < name.size(); i++) {
				deck.add(new Card(s, name.get(i), value.get(i)));
			}
		}
	}
	public Card dealCard() {
		return deck.get((int)(Math.random()*deck.size()));
	}
	public void shuffleDeck() {
		int replaceIndex;
		Card temp;
		for (int i = 0; i < deck.size(); i++) {
			replaceIndex = (int)(Math.random()*deck.size());
			temp = deck.get(i);
			deck.set(i, deck.get(replaceIndex));
			deck.set(replaceIndex, temp);
		}
	}
	public void allCards() {
		for (Card c: deck) {
			System.out.println(c);
		}
	}
}
