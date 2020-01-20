class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Rectangle r1 = new Rectangle(3.5, 4.77, 2, 3);
    Rectangle r2 = new Rectangle(7.6, 3.2);
    System.out.println(r1.toString());
    System.out.println(r2.toString());
    r1.flip();
    System.out.println(r1.area());
    System.out.println(r1.perimeter());
    Rectangle dilated = r1.dilate(2.5);

    Point p1 = new Point(7,9);
    System.out.println(p1);

    Point p2 = new Point(10, 13);
    System.out.println(p1.distance(p2));
    System.out.println("The midpoint of the two points is " + p1.midpoint(p2));
  }
}