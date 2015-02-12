public class TestCourse {

	public static void main(String[] args) {
		Course physics = new Course("1068 Physics");
		physics.addStudent("Are Bernt");
		physics.addStudent("Conrad Delta");
		physics.addStudent("Erik Fagermo");
		
		System.out.println(physics.getNumberOfStudents());
		for (int i = 0; i < physics.getStudents().length; i++) {
			if (physics.getStudents()[i] != null) {
				System.out.println(physics.getStudents()[i]);
			}
		}
		System.out.println("Removing nr Conrad Delta.");
		
		physics.dropStudent("Conrad Delta");
		System.out.println(physics.getNumberOfStudents());
		for (int i = 0; i < physics.getStudents().length; i++) {
			if (physics.getStudents()[i] != null) {
				System.out.println(physics.getStudents()[i]);
			}
		}
		
	}

}
