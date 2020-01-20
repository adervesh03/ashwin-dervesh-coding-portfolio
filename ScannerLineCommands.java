import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

  // make a String object without using "new"
  String s1 = "asdfasasfd";

  // make a String by calling constructor
  String s2 = new String("hi there");
  String s3 = s2 + 7;
  //System.out.println(s3);
  String name = "Kent";
  s2 += name;
  //System.out.println(s2);
  // create object to read information from a stream of characters
  Scanner sc = new Scanner(System.in);
  
  // System.out.print("Hi " + name + ", welcome to chatbot. What is your favorite number? ");
  // name = sc.nextLine();
  // int fave = sc.nextInt();
  //sc.nextLine(); // get new line character from stream


  // escape sequences  \n, \t, \\, \"

  // Name: Clint Gentry
  // Age: 21
  // Senior Quote: "That escalated quickly"
  //                -Author

  System.out.print("What is your name? ");
  name = sc.nextLine();
  System.out.print("What is your age? ");
  int age = sc.nextInt();
  sc.nextLine();
  System.out.print("What is your senior quote? ");
  String seniorQuote = sc.nextLine();
  System.out.print("Who wrote your senior quote? ");
  String author = sc.nextLine();
  String seniorInfo = "Name: " + name + "\n" + "Age: " + age + "\n" + "Senior Quote: \"" + seniorQuote + "\" \n" + "              -" + author;

  System.out.println(seniorInfo);
  }
}