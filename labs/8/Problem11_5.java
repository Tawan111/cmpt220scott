
public class Problem11_5 {
	
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("David Scott");
		course1.addStudent("Jon Jones");
		course1.addStudent("Zayn Evans");
		course2.addStudent("David Scott");
		course2.addStudent("Joe Johnson");

		System.out.println("Students in course1: " + course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Students in course2: " + course2.getNumberOfStudents());
	}
}
