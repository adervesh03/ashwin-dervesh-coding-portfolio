import java.util.ArrayList;

public class Delimiter {

	private String start;
	private String finish;
	
	
	public static void main(String[] args) {
		Delimiter bold = new Delimiter("<b>", "</b>");
		
		String[] stuff = {"<p>", "asdfasdfsd", "<html>", "<b>", "adgasdasd"};
		ArrayList<String> theBold = bold.findDelimiters(stuff);
		
		for (int i = 0; i < theBold.size(); i++) {
			System.out.println(theBold.get(i));
		}
	}
	
	public Delimiter(String s, String f) {
		start = s;
		finish = f;
	}
	
	public ArrayList<String> findDelimiters(String[] stuff) {
		// how to declare and initialize an ArrayList
		
		ArrayList<String> delimiters = new ArrayList<String>();
		
		ArrayList<Integer> numbers;
		numbers = new ArrayList<Integer>();

		for (String s: stuff) {
			if (s.equals(this.start) || s.equals(this.finish)) {
				delimiters.add(s); // adds item on to end of list
				// delimiters.add(1, s); adds item at a specific index
			}
		}
		return delimiters;
	}
}
