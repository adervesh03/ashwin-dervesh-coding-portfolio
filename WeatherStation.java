import core.data.DataSource;

public class WeatherStation {
	private String name, id, state;
	private double latitude, longitude;
	public WeatherStation(String n, String ID, String s, double lat, double lo) {
		name = n;
		id = ID;
		state = s;
		latitude = lat;
		longitude = lo;
	}
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getState() {
		return state;
	}
	public double getLatitude() {
		return latitude;
	}
	public Boolean isLocatedInState(String s) {
		if (state.equals(s)) {
			return true;
		}
		else {
			return false;
		}
	}
	public Observation currentWeather() {
		DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml"); 
	    ds.load();
	    Observation o = ds.fetch("Observation", "temp_f", "weather", "wind_degrees");
	    if (o.getTemp()!=0 && o.getWeather()!=null && o.getWindDegrees() != 0) {
	    	return o;
	    }
	    else {
	    	return null;
	    }
	}
	public String toString() {
		return "Name: " + name + "\nID: " + id + "\nState: " + state + "\nLatitude: " + latitude + "\nLongitude: " + longitude;
	}
}
