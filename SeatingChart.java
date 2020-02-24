import java.util.ArrayList;

public class SeatingChart {
	private Student[][] seats;
	
	// creates a seating chart with the given number of rows and columns from the students in studentList
	// empty seats are represented by null
	public SeatingChart(ArrayList<Student> studentList, int rows, int cols) {
		seats = new Student[rows][cols];
		
		int count = 0;
		for (int j = 0; j < cols; j++) {
			for (int i = 0; i < rows; i++) {
				if (count < studentList.size()) {
					seats[i][j] = studentList.get(count);
					count++;
				}
				else {
					seats[i][j] = null;
				}
			}
		}
	}
	public void alphebatizeStudents() {
		
	}
	// removes students who have more than the given number of absences from the seating chart, replaces them with null
	// returns the number of students removed
	public String removeAbsentStudents(int allowedAbsences) {
		int removed = 0;
		for (int j = 0; j < seats[0].length; j++) {
			for (int i = 0; i < seats.length; i++) {
				if (!(seats[i][j] == null) && (seats[i][j].getAbsences() > allowedAbsences)) {
					seats[i][j] = null;
					removed++;
				}
			}
		}
		return "" + removed + " students were removed";
	}
	public void addStudent(String name) {
		for (int j = 0; j < seats[0].length; j++) {
			for (int i = 0; i < seats.length; i++) {
				if (seats[i][j] == null) {
					seats[i][j] = new Student(name, 0);
				}
			}
		}
	}
	public String countAbsences() {
		int total = 0;
		for (Student[] row: seats) {
			for (Student s: row) {
				if (!(s == null)) {
					total += s.getAbsences();
				}
			}
		}
		return "There are " + total + " total absences";
	}
	public String toString() {
		String s = "";
		for (Student[] row: seats) {
			for (Student st: row) {
				if (!(st == null)) {
						s += "| " + st.toString() + " |";
				}
				else {
					s += "| " + "No Student |";
				}
			}
			s += "\n";
		}
		return s;
	}
}
