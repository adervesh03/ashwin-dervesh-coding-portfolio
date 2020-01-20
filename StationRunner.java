import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import core.data.*;
public class StationRunner {
	
	public static void main(String[] args) {
		
		DataSource data = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
		data.printUsageString();
	
		WeatherStation[] ws1 = data.fetchArray("WeatherStation", "station/station_name", "station/station_id", "station/state", "station/latitude", "station/longitude");
	
		WeatherStation[] allstns = data.fetchArray("WeatherStation", "station/station_name", 
				"station/station_id", "station/state",
				"station/latitude", "station/longitude");
		System.out.println("Total stations: " + allstns.length);
	
		filterByState(allstns, "IA");
	
		double[] allstnsLatitude = new double[allstns.length];
		
		for (int i = 0; i < allstns.length-1; i++) {
			allstnsLatitude[i] = allstns[i].getLatitude();
			Arrays.sort(allstnsLatitude);
		}
		double lowLat = allstnsLatitude[0];
		WeatherStation southMost = null;
		for (int i = 0; i < allstns.length; i++) {
			if (allstns[i].getLatitude() == lowLat) {
				southMost = allstns[i];
			}
		}
		System.out.println("The southern most station in the US is the " + southMost.getName() + " at a latitude of " + southMost.getLatitude());
		System.out.println(southMost.isLocatedInState("IA"));
		
		System.out.println(southMost.currentWeather()); 
	}
	
	public static void filterByState(WeatherStation[] myStations, String stateID) {
		for (WeatherStation ws: myStations) {
			if (ws.getState().equals(stateID)) {
				System.out.println(ws);
			}
		}
	}
	
	

}
