
public class Vocab {

	public static void main(String[] args) {
		Vocab v = new Vocab();
		System.out.println(v.findWord("div"));
		System.out.println(v.findWord("thing"));

		String[] otherWords = {"div", "hi", "h1", "cool", "xml"};
		System.out.println(v.countNotInVocab(otherWords));
		for (String ick: v.notInVocab(otherWords)) {
			System.out.println(ick);
		}
		
		
		
	}
	
	/** The controlled vocabulary for a Vocab object. */
	private String[] theVocab = {"h1", "p", "div", "a", "body", "html", "footnote"};
	
	 /** Searches for a string in theVocab. Returns true if its String parameter str is an exact match 
	  * to an element in theVocab and returns false otherwise. */
	public boolean findWord(String str){
		for (String s: theVocab) {
			if (s.equals(str)) {
				return true;
			}
		}
		return false;
	}
	
	 /** Counts how many strings in wordArray are not found in theVocab, as described in part (a). */
	public int countNotInVocab(String[] wordArray){
		int count = 0;
		for (String s: wordArray) {
			if (!this.findWord(s)) {
				count++;
			}
		}
		return count;
	}
	
	
	 /** Returns an array containing strings from wordArray not found in theVocab, as described in part (b). */
	public String[] notInVocab(String[] wordArray){
		String[] notVocab = new String[countNotInVocab(wordArray)];
		int count = 0;
		for (String s: wordArray) {
			if (!this.findWord(s)) {
				notVocab[count] = s;
				count++;
			}
		}
		return notVocab;
	}
	
	

}
