import java.util.Scanner;

public class FractionMath {

  public static void OtherMain() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter some fraction math");
    String line = sc.nextLine();
    System.out.println("The answer to " + line + " is ");

    int operator = -1;
    if (line.indexOf("+") != -1){
      operator = line.indexOf("+");
    }
    else if (line.indexOf("*") != -1){
      operator = line.indexOf("*");
    }
    Fraction f1 = getFraction(line, operator);
    String secondHalf = line.substring(operator+1);
    Fraction f2 = getFraction(secondHalf, secondHalf.length());

    String op = line.substring(operator, operator+1);
    if (op.equals("+")){
      System.out.println(f1.add(f2));
    }
    else if (op.equals("*")){
      System.out.println(f1.multiply(f2));
    }
  }

  public static Fraction getFraction(String line, int operator){
    int firstSlash = line.indexOf("/");
    int numerator = Integer.parseInt(line.substring(0, firstSlash));
    int denominator = Integer.parseInt(line.substring(firstSlash+1, operator));
    return new Fraction(numerator, denominator);
  }
}