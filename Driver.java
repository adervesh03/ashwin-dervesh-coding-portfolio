import java.awt.Color;

public class Driver {

	public static void main(String[] args) {
		
		/* some static methods we have used before */
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(5, 3));
		System.out.println(Math.random()*40);
		
		/* a static method is also known as a class method because it belongs to the class itself, not to any
		 * particular instance of the class.
		 * You MUST use the class name to call the method
		 */
		
		Car c1 = new Car(Color.red, "suv", 6);
		System.out.println(c1.getID());
		Car c2 = new Car(Color.blue, "sedan", 8);
		System.out.println(c2.getID());
		Car c3 = new Car(Color.green, "suv", 12);
		System.out.println(c3.getID());
		
		System.out.println(Car.numberofWheels);
		System.out.println(Car.distanceTraveled(70, 2));
	}

}
