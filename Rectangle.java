//length, width attributes
// position attribute (x, y)
// a constructor that supplies all 4 properties
// a constructor that just supplies size

public class Rectangle {

  private double length;
  private double width;
  private Point point;

  public Rectangle(double l, double w, double x, double y) {
    length = l;
    width = w;
    this.point = new Point(x, y);
  }
  public Rectangle(double l, double w) {
    length = l;
    width = w;
    this.point = new Point(0, width);
  }
  public String toString() {
    // return "The length is " + length + ", the width is " + width + ", and the xy position is (" + xPosition + ", " + yPosition + ").";
    return graph();
  }

  public void flip() {
    double temp = length;
    length = width;
    width = temp;
  }
  public void translate(double deltaX, double deltaY) {
    point.translate(deltaX, deltaY);
  }
  public double area() {
    double area = width*length;
    return area;
  }
  public double perimeter() {
    double perimeter = length*2 + width*2;
    return perimeter;
  }
  public Rectangle dilate(double scale) {
    return new Rectangle(this.length*scale, this.width*scale, point.getX(), point.getY());
  }
  
  


  
  
  
  
  final int GRAPH_X = 20, GRAPH_Y = 15;
public String graph() {
String g = "";
int right = (int)(point.getX() + length + 0.5);
int bottom = (int)(point.getY() - width + 0.5);
if (point.getY()-width < 0) bottom = (int)(point.getY()-width - 0.5);
int left = (int)(point.getX() + 0.5);
int top = (int)(point.getY()+0.5);

/* for testing purposes
System.out.println("LEFT: " + left + "\nRIGHT: " + right + "\nTOP: " + top + "\nBOTTOM " + bottom);
*/
// print y-axis up until top of rectangle is reached
for (int j =GRAPH_Y; j > top; j--) g+="|\n";
g+="|";
// spaces up until left side
for (int i = 0; i < left; i++) g+=" ";
// top of rectangle
for (int i = left; i < right; i++) g+= "_";
g+="\n";

// middle vertical lines of rectangle
for (int j = top-1; j > bottom; j--) {
g+= "|"; // y axis
// spaces up until left side
for (int i = 0; i < left-1; i++) g+=" ";
if (left >0 ) g+= "|"; // left side
for (int i = left; i < right; i++) g+= " "; // spaces between left/right sides
g+= "|\n"; // right side
}

if (bottom > 0) { // bottom is above x-axis
g+="|"; // y axis
// spaces up until left side
for (int i = 0; i < left-1; i++) g+=" ";
if (left > 0) g+="|";
for (int i = left; i < right; i++) g+= "_";
g+="|\n";

//for (int j = bottom; j > 0; j--) g+="|\n";

}

// more y-axis marks
for (int j = bottom-1; j > 0; j--) g+="|\n";

// if bottom is on x-axis or below it
if (top >= 0 && bottom <=0) {
g+="|";
for (int i =1; i<left; i++) g+="_";
if (left > 0) g+= "|";
for (int i = left; i < right;i++) g+="_";
g+="|";
for (int i = right+1; i < GRAPH_X; i++) g+="_";
}
else {
g+="|";
for (int i = 0; i < GRAPH_X; i++) g+="_";
}
g+= " x\n\n";

return g;
}
}