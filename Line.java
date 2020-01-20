public class APLine{
  private int a;
  private int b;
  private int c;
  private int x;
  private int y;

  // Line constructor
  public APLine(int num1, int num2, int num3){
    a = num1;
    b = num2;
    c = num3;
  }

  // returns the slope of the line
  public double getSlope(){
    double slope = (double)(-a) / b;
    return slope;
  }

  //Given a point with the parameters, checks if that point is on the given line
  public Boolean isOnLine(int xPos, int yPos){
    x = xPos;
    y = yPos;
    if ((double)this.a*x + (double)this.b*y + this.c == 0){
      return true;
    }
    else{
      return false;
    }
  }

  //Returns a table for 10 x and y values of a line
  public void ttable(){
    int tempx;
    int tempy;
    System.out.println("x | y\n_ | _");
    for (int i = 0; i <= 9; i++){
      tempx = i;
      tempy = (-this.c - this.a*i)/this.b;
      System.out.println(tempx + " | " + tempy);
    }
  }
}