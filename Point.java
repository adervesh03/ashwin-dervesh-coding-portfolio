
public class Point {
	private double x;
	  private double y;

	  public Point(double x, double y) {
	    this.x = x;
	    this.y = y;
	  }

	  public String toString() {
	    return "(" + x + ", " + y + ")";
	  }
	  public void translate(double changex, double changey) {
	    this.x += changex;
	    this.y += changey;
	  }
	  public double distance(Point other) {
	    double a2 = Math.pow(this.x - other.x, 2);
	    double b2 = Math.pow(this.y - other.y, 2);
	    double d = Math.sqrt(a2 + b2);
	    return d;
	  }
	  public Point midpoint(Point other) {
	    double xm = (this.x + other.x)/2;
	    double ym = (this.y + other.y)/2;
	    return new Point(xm, ym);
	  }

	  public double getX() {
	    return x;
	  }
	  
	  public double getY() {
	    return y;
	  }
	  
	  public void setX(double x) {
		  this.x = x;
	  }
	  
	  public void setY(double y) {
		  this.y = y;
	  }
	  
	  public boolean equals(Point other) {
		 return this.x == other.x && this.y == other.y;
	  }
}
