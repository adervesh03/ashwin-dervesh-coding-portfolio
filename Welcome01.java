import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import core.data.*;

public class Welcome01 {
   public static void main(String[] args) throws FileNotFoundException {
      String id = "KDSM";
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml"); 
      ds.setCacheTimeout(15 * 60);  
      ds.load();
      ds.printUsageString();
      float temp = ds.fetchFloat("windchill_f");
      String loc = ds.fetchString("location");
      System.out.println("The windchill at " + loc + " is " + temp + "F");
      /*
      DataSource ds2 = DataSource.connect("http://sermons.hopedesmoines.org/sermons.xml");
      ds2.load();
      ds2.printUsageString();
      System.out.println(ds2.fetchString("channel/item/author/value"));
      
      // to make an array
      String[] authors = ds2.fetchStringArray("channel/item/author/value");
      for (int i = 0; i < authors.length; i++) {
      	System.out.println(authors[i]);
      }
      */
      
      String[] stations = new String[2605];
      Scanner sc = new Scanner(new File("goodstations.txt"));
      for (int i = 0; i < stations.length; i++) {
          try {
    	  stations[i] = sc.nextLine();
    	  String id2 = stations[i];
    	  DataSource ds2 = DataSource.connect("http://weather.gov/xml/current_obs/" + id2 + ".xml"); 
    	  ds2.setCacheTimeout(15 * 60);  
    	  ds2.load();
    	  float temp2 = ds2.fetchFloat("temp_f");
    	  String loc2 = ds2.fetchString("location");
    	  System.out.println("The temperature at " + loc2 + " is " + temp2 + "F");
          }
          catch(core.access.DataAccessException e) {
        	  System.out.println("this station is not currently available");
          }
      }
      
      
   }
}
