
public class Square {
	private boolean black;
	private int num;
	
	public Square(boolean b, int n) {
		black = b;
		num = n;
	}
	public String toString() {
		if (black) {
			return "[0]";
		}
		if(num == 0) {
			return "   ";
		}
		return (num>9 ? num + " ": " " + num + " ");
	}
}
