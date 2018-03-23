
public class Problem10_9 {

	public static void main(String[] args) {
		
		Course cmpt220 = new Course("CMPT220");
		cmpt220.addStudent("David");
		cmpt220.addStudent("John,");
		cmpt220.addStudent("Mac");
		cmpt220.dropStudent("David");

		System.out.println("\nThe students in " + cmpt220.getCourseName() + " are:");
		String[] students = cmpt220.getStudents();
		for (int i = 0; i < cmpt220.getNumberOfStudents(); i++) {
			System.out.print(students[i] + " ");
		}
		
		System.out.println();
	}
}