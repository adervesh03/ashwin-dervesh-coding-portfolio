
public class TwoDArrays {

	public static void main(String[] args) {
		int[][] ints = new int[5][10];
		for (int i = 0; i < ints.length; i++) {
			for (int x = 0; x < ints[0].length; x++) {
				ints[i][x] = (int)(Math.random()*10);
			}
		}
		System.out.println(ints[0].length);
		
		for (int i = 0; i < ints.length; i++) {
			for (int x = 0; x < ints[0].length; x++) {
				System.out.print(ints[i][x] + " ");
			}
			System.out.println();
		}
		System.out.println(ints[3][2]);
		
		//filling a 2d array when you declare it
		String[][] words = {{"the", "top", "row"}, 
							{"the", "middle", "row"},
							{"the", "bottom", "row"}};
		
		//using enhanced for loops to acces items
		for (String[] s: words) {
			String sentence = "";
			for (String w: s) {
				sentence += w + " ";
			}
			System.out.println(sentence);
		}
		
		//traversing column-by-column instead of row-by-row
		
		for (int j = 0; j < ints[0].length; j++) {
			for (int i = 0; i < ints.length; i++) {
				System.out.print(ints[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
