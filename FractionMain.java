class Main {
  public static void main(String[] args) {
    
    System.out.println("Hello world!");

    Fraction f1 = new Fraction(1, 3);
    Fraction f2 = new Fraction(1, 2);
    Fraction f3 = new Fraction(-6, 9);
    System.out.println(f1.add(f2));
    System.out.println(f1.subtract(f2));
    System.out.println(f1.multiply(f2));
    System.out.println(f1.divide(f2));
    f3.reduce();
    System.out.println(f3);
    /*
    FractionMath.OtherMain();
    */
  }

  
  
}