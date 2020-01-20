import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import core.data.*;

public class DataLabProject {
	private String gender;
	private String race;
	private String year;
	private String location;
	private int aids_diagnoses;
	private double aids_diagnosis_rate;
	private int hiv_diagnoses;
	private double hiv_diagnosis_rate;
	private int deaths;
	private double death_rate;
	
	// aids/hiv number of diagnoses and deaths, rates of diagnoses and deaths
	// New York from 2011-2015, dependent on age, race, gender, etc
	public static void main(String[] args) {
		DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/fju2-rdad/rows.xml?accessType=DOWNLOAD"); 
		ds.setCacheTimeout(15 * 60);
		ds.load();
		ds.printUsageString();
		
		DataLabProject[] dlp = ds.fetchArray("DataLabProject", "row/row/gender", "row/row/race", "row/row/year", "row/row/borough", "row/row/aids_diagnoses", "row/row/aids_diagnosis_rate", "row/row/hiv_diagnoses", "row/row/hiv_diagnosis_rate", "row/row/deaths", "row/row/death_rate");
		System.out.println(dlp[4].getHIVRate());
		System.out.println(dlp[6]);
		
		System.out.println(dlp[213].getLocation());
		
		System.out.println(findData(dlp, "Male", "Asian/Pacific Islander", "2015", "Bronx"));
	}
	public DataLabProject(String g, String r, String y, String b, int aD, double aidsRate, int hD, double hivRate, int d, double deathRate) {
		gender = g;
		race = r;
		year = y;
		location = b;
		aids_diagnoses = aD;
		aids_diagnosis_rate = aidsRate;
		hiv_diagnoses = hD;
		hiv_diagnosis_rate = hivRate;
		deaths = d;
		death_rate = deathRate;
	}
	// given a gender, race, year, and borough it will return an dataset with those specifications
	public static String findData(DataLabProject[] data, String g, String r, String y, String l) {
		for (int i = 0; i < data.length; i++) {
			if (data[i].gender.equals(g) && data[i].race.equals(r) && data[i].year.equals(y) && data[i].location.equals(l)) {
				return "AIDS/HIV Status in " + y + " in " + l + 
						"\nGender: " + g + 
						"\nRace: " + r + 
						"\nNumber of AIDS Diagnoses: " + data[i].aids_diagnoses + " | AIDS Diagnosis Rate: " + data[i].aids_diagnosis_rate + 
						"\nNumber of HIV Diagnoses: " + data[i].hiv_diagnoses + " | HIV Diagnosis Rate: " + data[i].hiv_diagnosis_rate +
						"\nNumber of deaths: " + data[i].deaths + " | Death Rate: " + data[i].death_rate;
			}
		}
		return "No data available";
	}
	public String getGender() {
		return gender;
	}
	public String getRace() {
		return race;
	}
	public String getYear() {
		return year;
	}
	public String getLocation() {
		return location;
	}
	public int getNumAIDS() {
		return aids_diagnoses;
	}
	public double getAIDSRate() {
		return aids_diagnosis_rate;
	}
	public int getNumHIV() {
		return hiv_diagnoses;
	}
	public double getHIVRate() {
		return hiv_diagnosis_rate;
	}
	public int getDeaths() {
		return deaths;
	}
	public double getDeathRate() {
		return death_rate;
	}
	public String toString() {
		return "AIDS/HIV Status in " + year + " in " + location + 
				"\nGender: " + gender + 
				"\nRace: " + race + 
				"\nNumber of AIDS Diagnoses: " + aids_diagnoses + " | AIDS Diagnosis Rate: " + aids_diagnosis_rate + 
				"\nNumber of HIV Diagnoses: " + hiv_diagnoses + " | HIV Diagnosis Rate: " + hiv_diagnosis_rate +
				"\nNumber of deaths: " + deaths + " | Death Rate: " + death_rate;
	}
}
