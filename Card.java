import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Card {
	private String suit;
	private String rank;
	private int pointValue;
	
	public Card(String s, String r, int v) {
		suit = s;
		rank = r;
		pointValue = v;
	}
	public String suit() {
		return suit;
	}
	public String rank() {
		return rank;
	}
	public int pointValue(int v) {
		return pointValue;
	}
	public Boolean matches(Card other) {
		return this.suit.equals(other.suit) && this.rank.equals(other.suit);
	}
	public String toString() {
		return rank + " of " + suit;
	}
}
