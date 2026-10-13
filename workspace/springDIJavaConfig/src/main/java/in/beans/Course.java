package in.beans;

public class Course {
	private String courseName;
	private int marks;
	public Course(String courseName, int marks) {
		this.courseName = courseName;
		this.marks = marks;
	}
	public String toString() {
		return courseName + " - " + marks;
	}
}
