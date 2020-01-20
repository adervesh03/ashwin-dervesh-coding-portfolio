class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

     int intTempF = 70;
     //5/9 = 0
     double convert1 = 5 / 9 * (intTempF - 32);
     System.out.println(convert1);

    //changes it to a double, 5.0/9, so it can divide
    double convert2 = 5.0 / 9 * (intTempF - 32);
    System.out.println(convert2);
    
    double doubleTempF = 70;
    //5/9 = 0
    double convert3 = 5 / 9 * (doubleTempF - 32);
    System.out.println(convert3);
    
    //tempF is double so it can divide 
    double convert4 = (doubleTempF - 32) * 5 / 9;
    System.out.println(convert4);
  }
}