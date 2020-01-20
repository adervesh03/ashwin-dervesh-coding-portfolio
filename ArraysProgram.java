
public class ArraysProgram {

	public static void main(String args[]) {

		/* make the following calls to makePythagoreanTriple.
		/ print the results of each using the printIntArray method below. */
		printIntArray(makePythagoreanTriple(5, 2));
		printIntArray(makePythagoreanTriple(2, 5));
		printIntArray(makePythagoreanTriple(3, 1));
		

		/*make calls to computeScore for each word in the array below.
		*/
		String scrabbleWords[] = {"zeta", "quantify", "banana", "joyful"};
		
		for (String str: scrabbleWords) {
			System.out.println(str + " is worth " + computeScore(str) + " points in Scrabble");
		}
	
		/* tests for rotateRight */
		int [] numbers = {50, 60, 70, 80, 90};
		System.out.print("Rotate this right one spot: ");
		printIntArray(numbers);
		rotateRight(numbers);
		System.out.print("Results in: ");
		printIntArray(numbers);
		

		int [] numbers2 = {100, 200};
		System.out.print("Rotate this right one spot: ");
		printIntArray(numbers2);
		rotateRight(numbers2);
		System.out.print("Results in: ");
		printIntArray(numbers2);

		
	}

	
	public static void printIntArray(int nums[]) {
		for(int i = 0; i < nums.length-1; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println(nums[nums.length-1]);
	}
	
	public static int[] makePythagoreanTriple(int m, int n) {
		int a = 0;
		int b = 0;
		int c = 0;
		if (m >= n) {
			a = (int)Math.pow(m, 2) - (int)Math.pow(n, 2);
			b = 2 * m * n;
			c = (int)Math.pow(m, 2) + (int)Math.pow(n, 2);
		}
		if (m < n) {
			a = (int)Math.pow(n, 2) - (int)Math.pow(m, 2);
			b = 2 * n * m;
			c = (int)Math.pow(n, 2) + (int)Math.pow(m, 2);
		}
		int[] pythTriple = {a, b, c};
		return pythTriple;
	}
	
	
	public static int computeScore(String str) {
		int score = 0;
		int index = 0;
		int[] points = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
		String alph = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < str.length(); i++) {
			index = alph.indexOf(str.substring(i, i+1));
			score += points[index];
		}
		return score;
	}
	

	
	public static void rotateRight(int[] vals) {
		int temp = vals[vals.length - 1];
		for (int i = vals.length-1; i > 0; i--) {
			vals[i] = vals[i-1];
		}
		vals[0] = temp;
	}

}

