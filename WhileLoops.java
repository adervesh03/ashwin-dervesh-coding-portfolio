import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* System.out.println("What number would you like factors of?");
		

		int num = sc.nextInt();
		
		int factor = 1;
		int numfactors = 0;
		while (factor <= num) {
			if (num % factor == 0) {
				System.out.println(factor + " is a factor of " + num);
				numfactors++;
			}
			factor++;
		}
		if (numfactors <= 2) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
		*/
		System.out.println("add a number to average: ");
		int total = 0;
		int numNumbers = 0;
		int nextNum = sc.nextInt();
		while (nextNum != 0) {
			total += nextNum;
			numNumbers++;
			System.out.println("next number: ");
			nextNum = sc.nextInt();
		}
		double average = (double) total/numNumbers;
		System.out.println("The average of your numbers is " + average);
		
		}
		
	}

