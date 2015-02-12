public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
		if(numberOfStudents == students.length){
			String[] altArr = new String[numberOfStudents*2];
			System.arraycopy(students, 0, altArr, 0, numberOfStudents);
			students = altArr;
		}
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
		numberOfStudents++;
	}
	public String[] getStudents() {
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i].equals(student)){
				students[i] = null;
				numberOfStudents--;
				break;
			}
		}
	}
	public void clear(){
		students = new String[100];
		numberOfStudents = 0;
	}
}
