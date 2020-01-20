
public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(i + " " + j + "    ");
			}
			System.out.println();
		}
		for (int i = 8; i >= 0; i--) {
			for (int j = i; j < 10; j++) {
				System.out.print(i + " " + j + "   ");
			}
			System.out.println();
		}
		for (int x = 0; x < 5; x++) {
			for(int y = 0; y < 5; y++) {
				if ((x+y) % 2 == 0) {
					System.out.print("*");
				}
				else {
					System.out.print("@");
				}
			}
			System.out.println();
		}
		
		int p = 10;
		while (p > 0) {
			String word = "persnickety";
			int q = 0;
			while (q < word.length()) {
				if (word.substring(q, q+1).compareTo("m") < 0) {
					p--;
					System.out.println(word.substring(q, q+1));
				}
				q++;
			}
		}
	}

}
