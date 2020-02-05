import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class SortingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size = (int)(Math.random()*40+10);
		
		System.out.println("Selection Sorting");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i< size; i++) {
			numbers.add((int)(Math.random()*1000));
		}
		System.out.println(numbers);
		SelectionSort(numbers);
		System.out.println(numbers + "\n\n");
		
		int[] array2 = {19, 4, 5};
		refresh(numbers, array2);
		System.out.println(numbers);
		SelectionSort(numbers);
		System.out.println(numbers + "\n\n");
		
		int[] array3 = {14, 5};
		refresh(numbers, array3);
		System.out.println(numbers);
		SelectionSort(numbers);
		System.out.println(numbers + "\n\n");
	
		int[] array4 = {20};
		refresh(numbers, array4);
		System.out.println(numbers);
		SelectionSort(numbers);
		System.out.println(numbers + "\n\n");
		
		
		System.out.println("Insertion Sorting");
		numbers.removeAll(numbers);
		for (int i = 0; i< size; i++) {
			numbers.add((int)(Math.random()*1000));
		}
		System.out.println(numbers);
		InsertionSort(numbers);
		System.out.println(numbers + "\n\n");
		
		
		int[] array5 = {20, 5, 2, 6, 7, 55, 4};
		refresh(numbers, array5);
		System.out.println(numbers);
		InsertionSort(numbers);
		System.out.println(numbers + "\n\n");
		
		int[] array6 = {15, 4, 1};
		refresh(numbers, array6);
		System.out.println(numbers);
		InsertionSort(numbers);
		System.out.println(numbers + "\n\n");
		
		int[] array7 = {12, 4};
		refresh(numbers, array7);
		System.out.println(numbers);
		InsertionSort(numbers);
		System.out.println(numbers + "\n\n");
		
		int[] array8 = {20};
		refresh(numbers, array8);
		System.out.println(numbers);
		InsertionSort(numbers);
		System.out.println(numbers + "\n\n");
		
	}
	
	public static void SelectionSort(ArrayList<Integer> nums) {
		int temp;
		for (int i = 0; i < nums.size(); i++) {
			for (int x = i; x < nums.size(); x++) {
				if (nums.get(i) > nums.get(x)) {
					temp = nums.get(i);
					nums.set(i, nums.get(x));
					nums.set(x, temp);
				}
			}
		}
	}

	public static void InsertionSort(ArrayList<Integer> nums) {
		int temp;
		for (int i = 1; i < nums.size(); i++) {
			if (nums.get(i) < nums.get(i-1)) {
				for (int x = i; x >= 1; x--) {
					if (nums.get(x) < nums.get(x-1)) {
						temp = nums.get(x);
						nums.set(x, nums.get(x-1));
						nums.set(x-1, temp);
					}
				}
			}
		}
	}
	
	public static void refresh(ArrayList<Integer> nums, int[] newnums) {
		nums.removeAll(nums);
		for (int x: newnums) {
			nums.add(x);
		}
	}


}
