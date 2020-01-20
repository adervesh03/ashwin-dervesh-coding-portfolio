import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add((int)(Math.random()*41 + 50));
		}

		for (int x: numbers) {System.out.print(x + " ");}
		System.out.println();
		
		int temp = numbers.get(0);
		numbers.set(0, numbers.get(numbers.size()-1));
		numbers.set(numbers.size()-1, temp);
		
		for (int i = 0; i < 10; i++) {System.out.print(numbers.get(i) + " ");}
		System.out.println();
		
		for (int i = numbers.size()-1; i >= 0; i--) {
			if (numbers.get(i) < 60) {
				numbers.remove(i);
			}
		}
		
		for (int x: numbers) {System.out.print(x + " ");}
		System.out.println();
	}

}
