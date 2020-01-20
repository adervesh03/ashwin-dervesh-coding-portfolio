import java.awt.Color;

public class Car {
	
	// instance variables
	private Color co;
	private String type;
	private int numCylinders;
	private int id;
	
	/* class variable
	 * it is accessible by all Car objects
	 * it is the same value for all car objects
	 */
	private static int counter = 0;
	
	// variable that is shared by all Cars, but cannot be changed
	public static final int numberofWheels = 4;
	
	public Car(Color c, String typeCar, int n) {
		co = c;
		type = typeCar;
		numCylinders = n;
		
		counter++;
		id = counter;
	}
	
	public Color getColor() {
		return co;
	}
	
	public void setColor(Color c) {
		co = c;
	}
	
	public int getID() {
		return id;
	}
	
	public static double distanceTraveled(double speed, double time) {
		/* static methods CANNOT access instance variables,
		 * because instance variables belong to a particular Car,
		 * not to the class
		 * System.out.println("this " + co + " car is going fast");
		 */
		return speed*time;
	}
}
