import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import core.data.*;

public class Observation {
	private String location;
	private float temp;
	private String timeStamp;
	private float windchill;
	private String weather;
	private float wind_degrees;
	
	public static void main(String[] args) {
		
		String id = "KDSM";
		DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml"); 
	    ds.setCacheTimeout(15 * 60);  
	    ds.load();
	    Observation o1 = ds.fetch("Observation", "location", "temp_f", "observation_time", "windchill_f");
	    System.out.println(o1);
	    System.out.println();
	    
	    String id2 = "PAEN";
		DataSource ds2 = DataSource.connect("http://weather.gov/xml/current_obs/" + id2 + ".xml"); 
	    ds2.setCacheTimeout(15 * 60);
	    ds2.load();
	    Observation o2 = ds2.fetch("Observation", "location", "temp_f", "observation_time", "windchill_f");
	    System.out.println(o2);
	    
	    o1.colderThan(o2);
	}

	public Observation(String loc, float temperature, String time, float wc) {
		location = loc;
		temp = temperature;
		timeStamp = time;
		windchill = wc;
	}
	public Observation(float temperature, String Weather, float wind) {
		temp = temperature;
		weather = Weather;
		wind_degrees = wind;
	}
	
	public String getLocation() {
		return location;
	}
	public float getTemp() {
		return temp;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public float getWindChill() {
		return windchill;
	}
	public String getWeather() {
		return weather;
	}
	public float getWindDegrees() {
		return wind_degrees;
	}
	public String toString() {
		return "The temperature is: " + temp + "\nThe weather is: " + weather + "\nThe wind degrees is: " + wind_degrees;
	}
	public Boolean colderThan(Observation other) {
		if (this.temp < other.temp) {
			return true;
		}
		else {
			return false;
		}
	}
}
