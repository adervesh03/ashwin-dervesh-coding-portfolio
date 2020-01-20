import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsAlgorithms {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> words = new ArrayList<String>();
		
		Scanner sc = new Scanner(new File("words2.txt"));
		words.add(sc.nextLine()); // add first thing to list
		
		while(sc.hasNext()) {
			boolean added = false;
			String item = sc.nextLine();
			int position = 0;
			while (position < words.size() && !added) {
				if (item.compareTo(words.get(position)) <= 0) {
					words.add(position, item);
					added = true;
				}
				position++;
			}
			if (!added) {
				words.add(item); // add to the end if it hasnt been added yet
			}
		}
		for (String s: words) {
			System.out.println(s);
		}
		
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ints.add((int)(Math.random()*9 + 1));
		}
		
		System.out.println(ints);
		for (int i = 0; i < ints.size(); i++) {
			int comparing = ints.get(i);
			for (int x = ints.size() - 1; x > i; x--) {
				if (comparing == ints.get(x)) {
					ints.remove(x);
				}
			}
		}
		System.out.println(ints);
		
		
		
		
		
		
	}

}
