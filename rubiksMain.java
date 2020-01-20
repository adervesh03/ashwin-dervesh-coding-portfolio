class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    rubiks p1 = new rubiks(3, 31, "CFOP");
    System.out.println(p1.toString());

    rubiks p2 = new rubiks("megaminx", 57);
    System.out.println(p2.toString());

    rubiks p3 = new rubiks(7, 389, "reduction");
    System.out.println(p3.toString());

    p1.betterTime();
    System.out.println(p1.toString());
  }
}