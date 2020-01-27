import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Card {
	private String suit;
	private String name;
	private int value;
	
	public Card(String s, String n, int v) {
		suit = s;
		name = n;
		value = v;
	}
	public void setValue(int n) {
		value = n;
	}
	public String toString() {
		return name + " of " + suit;
	}
}
