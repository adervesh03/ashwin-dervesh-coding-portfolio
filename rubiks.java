public class rubiks {
  //size is the length of a side ie, size =3 would be 3 by 3 by 3
  private int size;
  private int solveTime;
  private String solveMethod;
  // if puzzle is not a standard cube
  private String puzzle;

  //Constructor
  public rubiks(int s, int st, String sm) {
    size = s;
    solveTime = st;
    solveMethod = sm;
  }
  public rubiks(String p, int st) {
    puzzle = p;
    solveTime = st;
  }
  public String toString() {
    if (size == 0) {
      return "I solved a " + puzzle + " in " + solveTime + " seconds.";
    }
    else {
      return "I solved a " + size + " by " + size + " by " + size + " rubiks cube in " + solveTime + " seconds using the " + solveMethod + " method.";
    }
      
  }
  public void betterTime() {
    solveTime -= 5;
  }

}