
public class PA27 {

	public static void main(String[] args) {
		WordGames w1 = new WordGames("turtle");
		System.out.println(w1.scramble());
		
		WordGames w2 = new WordGames("NoU");
		System.out.println(w2.bananaSplit(2, "__________"));
		
		WordGames w3 = new WordGames("Hello");
		System.out.println(w3.bananaSplit("l", "NO"));
		
		System.out.println(w3);
	}
}
