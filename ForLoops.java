
public class ForLoops {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		/*
		* for (spot1; spot2; spot3)
		 * 
		 * spot1 --> declaring a counter, occurs before the loop starts
		 * spot 2 --> boolean condition, checked before each iteration
		 * spot3 --> update counter, code runs after each iteration
		 */
		int x;
		for (x = 20; x > 0; x--) {
			System.out.println(x*5);
		}
		
		String word = "sufferin succotash";
		int y;
		for (y = 0; y < word.length(); y++) {
			if (word.charAt(y) == 's') {
				word = word.substring(0, y) + "t" + word.substring(y+1);
			}
		}
		System.out.println(word);
	}
	//count the number of times sub appears in w
	public static int countOccurences(String w, String sub) {
		int counter;
		/*
		for (int i = 0; i < w.length(); i++) {
			if (w.substring(0))
		}
		*/
		return 5;
	}

}
