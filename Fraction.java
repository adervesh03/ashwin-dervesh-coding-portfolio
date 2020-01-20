public class Fraction {
  private int n;
  private int d;
  
  public Fraction(int numerator, int denominator){
    n = numerator;
    d = denominator;
    this.reduce();
  }
  public String toString(){
    return n + "/" + d;
  }
  public Fraction add(Fraction other){
    int thisN = this.n*other.d;
    int otherN = other.n*this.d;
    int commonD = this.d*other.d;
    int fracN = thisN + otherN;
    return new Fraction(fracN, commonD);
  }
  public Fraction subtract(Fraction other){
    Fraction negative = new Fraction(-(other.n), other.d);
    return this.add(negative);
  }
  public Fraction multiply(Fraction other){
    n = this.n * other.n;
    d = this.d * other.d;
    return new Fraction(n, d);
  }
  public Fraction divide(Fraction other){
    Fraction recip = new Fraction(other.d, other.n);
    return this.multiply(recip);
  }
  public void reduce(){
    int num1 = Math.abs(n);
    int num2 = Math.abs(d);
    while (num1 != num2){
      if (num1 > num2){
        num1 -= num2;
      }
      if (num2 > num1){
        num2 -= num1;
      }
    }
    n /= num1;
    d /= num2;
  }
}