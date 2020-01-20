class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Person p1 = new Person("Levi", "Dahal", 23, 156.3);
    Person p2 = new Person("ALEX", "YES", 17, 42.7);
    
    p1.birthday();
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    p1.grow(.7);
    System.out.println("Levi grew! He is now " + p1.getHeight() + " inches tall.");
  }
}