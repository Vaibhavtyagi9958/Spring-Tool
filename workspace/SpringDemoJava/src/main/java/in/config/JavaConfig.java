package in.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.beans.Student;

@Configuration
public class JavaConfig {
	@Bean(name="std1")
	public Student getStudent() {
		Student stu = new Student();
		stu.setName("Vinay");
		stu.setAge(24);
		stu.setMarks(40.5f);
		return stu;
	}
	@Bean(name="std2")
	public Student getStudent2() {
		Student stu = new Student();
		stu.setName("Ajay");
		stu.setAge(29);
		stu.setMarks(45.9f);
		return stu;
	}

}
