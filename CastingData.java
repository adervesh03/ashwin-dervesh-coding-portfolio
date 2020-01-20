class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    
  // casting means intentionally converting one data type to another
  int x = (int)9.8;
  double y = (double)9;
  String s = 9.8 + "";
  System.out.println(x);

  int answer = (int)(9.8 + 11.9);

  int r = 5;
  double volume = (double)4/3 * Math.PI * Math.pow(r, 3);
  System.out.println(volume);
  
  int radius = 5;
  int height = 10;
  double pi = Math.PI;
  int volume = (int)((double)1/3 * pi * radius * radius * height);
  System.out.println("The volume of the cone is " + volume + " cubic units.");
  }
}