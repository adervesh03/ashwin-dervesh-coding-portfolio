import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Deck {
	private ArrayList<Card> deck;
	private int dealCounter = -1;
	
	public Deck(String[] suit, String[] rank, int[] value) {
		deck = new ArrayList<Card>();
		for (String s: suit) {
			for (int i = 0; i < rank.length; i++) {
				deck.add(new Card(s, rank[i], value[i]));
			}
		}
	}
	public boolean isEmpty() {
		if (deck.size() - 1 - dealCounter == 0) {
			return true;
		}
		return false;
	}
	public String size() {
		return "The size of the deck is " + (deck.size() - dealCounter - 1);
	}
	public Card deal() {
		dealCounter++;
		return deck.get(dealCounter);
	}
	public void shuffle() {
		int replaceIndex;
		Card temp;
		for (int i = 0; i < deck.size(); i++) {
			replaceIndex = (int)(Math.random()*deck.size());
			temp = deck.get(i);
			deck.set(i, deck.get(replaceIndex));
			deck.set(replaceIndex, temp);
		}
	}
	public String toString() {
		String dealtCards = "";
		String undealtCards = "";
		for (int i = 0; i <= dealCounter; i++) {
			dealtCards += deck.get(i).toString() + ", ";
			if ((((i+1) % 3) == 0) && (i != 0)) {
				dealtCards += "\n";
			}
		}
		for (int i = deck.size()-1; i > dealCounter; i--) {
			undealtCards += deck.get(i).toString() + ", ";
			if ((((i+1) % 3) == 0) && (i != deck.size()-1)) {
				undealtCards += "\n";
			}
		}
		return "All dealt cards:\n" + dealtCards + "\nAll undealt cards:\n" + undealtCards;
	}
}
