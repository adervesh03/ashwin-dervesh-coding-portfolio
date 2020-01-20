
public class MathStuff {

	public static void main(String[] args) {
		
		/* Math functions are in Math class, they are all static functions
		 * Statis means the functions are 'class' functions, not instance functions. They are not 
		 * specific to any one object of the class
		 * 
		 * so we will not do this:
		 * 		Math m = new Math();
		 * 		m.pow(2, 3);
		 * 
		 * We WILL do this:
		 * 		Math.pow(2, 3);
		 */

		System.out.println(Math.pow(2, 3));
		// random decimals from 0 to 1
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random());
		}
		// random ints from 0 to 10
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*11));
		}
		// random ints from 3 to 7
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*5 + 3));
		}
		// random ints from 30 to 39
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*10 + 30));
		}
		// random ints from -3 to 7
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*11 +-3));
		}
		// random ints from low to high
		for (int i = 0; i < 10; i++) {
			System.out.println(newRandom(78, 81));
		}
	}
	public static int newRandom(int low, int high) {
		
		int howmanynumbers = high - low + 1;
		return (int)(Math.random()*howmanynumbers + low);
		
	}

}
