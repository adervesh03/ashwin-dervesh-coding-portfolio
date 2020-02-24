import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SeatingChartRunner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner names = new Scanner(new File("names.txt"));
		ArrayList<Student> students = new ArrayList<Student>();
		
		int stus = (int)(Math.random()*11+15);
		int x = 0;
		while (x < stus) {
			students.add(new Student(names.next(), (int)(Math.random()*10)));
			names.nextLine();
			x++;
		}
		// System.out.println(students);
		
		int rows = 0;
		int cols = 0;
		while (rows*cols <= students.size()) {
			rows = (int)(Math.random()*5+3);
			cols = (int)(Math.random()*5+3);
		}
		
		System.out.println(rows + " rows, " + cols + " columns for " + students.size() + " students");
		SeatingChart sc = new SeatingChart(students, rows, cols);
		System.out.println(sc);
		
		System.out.println(sc.removeAbsentStudents(6));
		System.out.println(sc);
		
		ArrayList<Student> levis = new ArrayList<Student>();
		
		for (int i = 0; i < 20; i++) {
			levis.add(new Student("Levi", (int)(Math.random()*10)));
		}
		
		SeatingChart levi = new SeatingChart(levis, 5, 4);
		System.out.println(levi);
		System.out.println(levi.countAbsences());
		
		System.out.println(levi.removeAbsentStudents(6));
		System.out.println(levi);
		System.out.println(levi.countAbsences());
		
	}

}
