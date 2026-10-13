package in.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private String name;
	private Address address;
	private Course course;
	
	public Student(String name, Address address, Course course) {
		this.name = name;
		this.address = address;
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public Course getCourse() {
		return course;
	}
}
