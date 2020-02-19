
public class CrosswordRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean [][] blacksquares = {{true, false,false,true, true, true, false,false,false}, 
									 {false,false,false,false,true, false,false,false,false}, 
									 {false,false,false,false,false,false,true, true, true},
									 {false,false,true, false,false,false,true, false,false},
									 {true, true, true, false,false,false,false,false,false},
									 {false,false,false,false,true,false,false,false,false},
									 {false,false,false,true, true, true, false,false,true}};
		
		Crossword cw = new Crossword(blacksquares);
		
		System.out.println(cw);
		
	}

}
