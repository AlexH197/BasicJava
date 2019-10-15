package alone;

public class Student {
	private String name;
	private int studentID;
	
	public Student() {}
	
	public Student(int studentID, String name) {
		this.name = name;
		this.studentID = studentID;
	}
	public void showStudentInfo() {
		System.out.println(studentID + ", " + name);
	}
}
