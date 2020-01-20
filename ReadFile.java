import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("gettys.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("couldn't find file");
		}
		
		if (sc != null) {
			while(sc.hasNext()) {
				String word = sc.next();
				// only print words that end with "ed"
				if (word.length() >= 2 && word.substring(word.length()-2).equals("ed")) {
					System.out.println(word);
				}
			}
		}
		else{
			
			System.out.println("scanner was not initialized");
		}
		
		
		System.out.println("end of program");
	}

}
