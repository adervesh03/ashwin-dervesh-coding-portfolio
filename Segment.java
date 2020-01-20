/**
 * Represents a line segment connecting two endpoints
 * 
 * @author ad34797
 *
 */
public class Segment {

	private Point p1;
	private Point p2;
	
	/**
	 * Given two Point objects, constructs a Segment
	 * @param p1	the first endpoint of the segment
	 * @param p2	the second endpoint of the segment
	 */
	public Segment(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public String toString() {
		return "this segment connects "+ p1 + " with " + p2;
	}

	// getter method, aka accessor, gives read access to users
	public Point getP1() {
		return p1;
	}

	// setter method, aka mutator, gives write access to users
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	
	/**
	 * gets the second endpoint of the segment
	 * 
	 * @return  a Point object representing the second endpoint of the segment
	 */
	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}
	
	/**
	 * Checking if two Segment objects are equal
	 * 
	 * Compares this Segment with another segment, returns true if the endpoints are identical
	 * 
	 * @param other The Segment being compared
	 * @return  true if endpoints of the two segments are the same, false otherwise
	 */
	public boolean equals(Segment other) {
		return (this.p1.equals(other.p1) && this.p2.equals(other.p2)) || (this.p1.equals(other.p2) && this.p2.equals(other.p2));
	}
}
