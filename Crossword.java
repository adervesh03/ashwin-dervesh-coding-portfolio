
public class Crossword {
	private Square[][] squares;
	
	//initialize squares to be the same size as blackSquares
	public Crossword(boolean[][] blackSquares) {
		squares = new Square[blackSquares.length][blackSquares[0].length];
		int counter = 1;
		for (int i = 0; i < blackSquares.length; i++) {
			
			for (int j = 0; j < blackSquares[0].length; j++) {
				if (toBeLabeled(i, j, blackSquares)) {
					squares[i][j] = new Square(false, counter);
					counter++;
				}
				else {
					squares[i][j] = new Square(blackSquares[i][j], 0);
				}
			}
		}
	}
	
	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		//if its a blackSquare
		if (blackSquares[r][c]) {
			return false;
		}
		//deal with white squares
		if (r == 0 || c == 0) {
			return true;
		}
		// if the square to the left or above is black
		if (blackSquares[r-1][c] || blackSquares[r][c-1]) {
			return true;
		}
		return false; // all white numbered squares are taken care of
	}
	
	public String toString() {
		String s = "";
		for (Square[] row: squares) {
			for (Square sq: row) {
				s += sq.toString();
			}
			s += "\n";
		}
		return s;
	}
}
