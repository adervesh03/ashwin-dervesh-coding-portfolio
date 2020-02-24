
public class Student {
	private String firstName;
	private int absences;
	
	public Student(String f, int n) {
		firstName = f;
		absences = n;
	}
	public String getFirst() {
		return firstName;
	}
	public int getAbsences() {
		return absences;
	}
	public String toString() {
		return firstName + " " + absences;
	}
}
