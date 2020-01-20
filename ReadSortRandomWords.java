import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadSortRandomWords {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] nums2 = nums;
		
		//nums2[0] = 500;
		// What will the value of nums[0] be?
		// 500
		System.out.println(nums[0]);
		nums2 = new int[50];
		
		// how to make a copy of an array
		nums2 = new int[nums.length];
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = nums[i];
		}
		// option 2
		nums2 = nums.clone();
		nums2[0] = 1000;
		System.out.println(nums[0]);
		
		printArray(nums);
		
		// when you send an array to a method, its values can be changed
		doStuffRegular(nums);
		printArray(nums);
		
		// you CANNOT change an array using an enhanced for loop
		doStuffEnhanced(nums);
		printArray(nums);
		
		
		File f = new File("words.txt");
		Scanner sc = new Scanner(f);
		File f2 = new File("words2.txt");
		Scanner sc2 = new Scanner(f2);
		int i = 0;
		String[] words1 = new String[50];
		String[] words2 = new String[50];

		while(sc.hasNext()) {
			words1[i] = (sc.next());
			words2[i] = (sc2.next());
			
			i++;
		}
		System.out.println(i);
		Arrays.sort(words1);
		System.out.println(words1[0]);
		System.out.println(words1[49]);
		Arrays.sort(words2);
		System.out.println(words2[0]);
		System.out.println(words2[49]);
		
		String[] newWords = topTwenty(words1, words2);
		printWords(newWords);
	}
	
	/* write a static void method that takes an array of integers and prints them using an enhanced for loop */
	public static void printArray(int[] array) {
		for (int n: array) {
			System.out.print(n + " ");
		}
		System.out.println();
	}
	public static void printWords(String[] vals) {
		int c = 0;
		for (String s: vals) {
			System.out.print(s + " ");
			c++;
			if (c % 5 == 0) {
				System.out.println();
			}
		}
	}
	public static String[] topTwenty(String[] vals, String[] vals2) {
		// vals[x] comes before vals2[y]
		// vals[x].compareTo(vals2[y]) < 0;
		String[] words = new String[20];
		int x = 0;
		int y = 0;
		for (int i = 0; i < 20; i++) {
			if (vals[x].compareTo(vals2[y]) < 0) {
				words[i] = vals[x];
				x++;
			}
			else if (vals[x].compareTo(vals2[y]) > 0) {
				words[i] = vals2[y];
				y++;
			}
		}
		return words;
	}
	
	public static void doStuffRegular(int [] vals) {
		for (int i = 0; i < vals.length; i++) {
			if (vals[i] % 2 == 0) 
				vals[i] = 100;
		}
	}
	
	public static void doStuffEnhanced(int [] vals) {
		for (int val: vals) {
			if (val % 2 == 0)
				val = -100;
		}
	}

}
