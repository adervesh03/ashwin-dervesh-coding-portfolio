
public class SegmentRunner {

	public static void main(String[] args) {

		// if you havent written any constructors, Java provides a default no args constructor
		// if you write any constructors that have parameters, 
		// there is no longer a default java provided constructor
		Segment s1 = new Segment(new Point(8, 2), new Point(-2, 7));
		Segment s2 = new Segment(new Point(-85, 1), new Point(5,2));
		Segment s3 = s2;
		
		// compares memory locations to see if two variables are pointing at the same object
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);

		System.out.println(s1);
		
		Point mypoint = s1.getP1();
		
		System.out.println(mypoint);
		
		mypoint = new Point(100, 200);
		mypoint.setX(7);
		System.out.println(s1);
	}

}
