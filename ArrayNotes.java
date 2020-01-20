import java.awt.Point;

public class ArrayNotes {

	public static void main(String[] args) {
		
		int[] numbers = new int[4];
		System.out.println(numbers.length);
		System.out.println(numbers[0]);
		System.out.println(numbers[numbers.length-1]);
		
		numbers[0] = 78;
		numbers[1] = 121;
		numbers[2] = 43;
		numbers[3] = 675;
		System.out.println(numbers[0]);
		
		// multiple assignment only works at declaration
		String[] words = {"penguin", "dolphin", "zebra", "gnu"};
		
		Point[] points = new Point[3];
		points[0] = new Point(1, 2);
		points[1] = new Point(3, 4);
		points[2] = new Point(9,1);
		
		Point[] more_points = {new Point(6, 1), new Point(0, 0)};
		System.out.println(more_points[1]);
		
		for (int i = words.length-1; i>=0; i--) {
			System.out.println(words[i]);
		}
		for (String s:words) {
			System.out.println(s);
		}
		for (int n: numbers) {
			if (n>100) {
				System.out.println(n);
			}
		}
	}

}
