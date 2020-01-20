public class Person{
// a class defines the properties an object will have and the actions it can take

  private double height; // just declaring variables, not initializing
  private int age;
  private String firstName;
  private String lastName;
  private String color;

  // what happens when a person object is made
  // this special method is called the Constructor
  public Person(String fname, String lname, int a, double h, String clr) {
    firstName = fname;
    lastName = lname;
    age = a;
    height = h;
    color = clr;
  }
  public String toString() {
    return "My name is " + firstName + " " + lastName + ", " + "and I am " + age + " years old.";
  }

  public void birthday() {
    age++;
  }
  public void grow(double amt) {
    height += amt;
  }

  public double getHeight() {
    return height;
  }
}