public class WordGames {
	
	public String word;

	public WordGames(String w) {
		word = w;
	}
	public String scramble() {
		int middle = word.length()/2;
		String firstHalf = word.substring(0, middle);
		String secondHalf = word.substring(middle);
		String scrambled = secondHalf+firstHalf;
		return scrambled;
	}
	public String bananaSplit(int insertIdx, String insertText) {
		String beforeWord = this.word.substring(0, insertIdx);
		String afterWord = this.word.substring(insertIdx);
		String Word = insertText;
		String bananaSplitWord = beforeWord + Word + afterWord;
		return bananaSplitWord;
	}
	public String bananaSplit(String insertChar, String insertText) {
		int insertIdx = word.indexOf(insertChar);
		String beforeWord = this.word.substring(0, insertIdx);
		String afterWord = this.word.substring(insertIdx);
		String Word = insertText;
		String bananaSplitWord = beforeWord + Word + afterWord;
		return bananaSplitWord;
	}
	public String toString() {
		return "[" + word + "]";
	}
}