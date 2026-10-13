package in.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.beans.Address;
import in.beans.Course;
import in.beans.Student;

@Configuration
public class JavaConfig {

	@Bean
	public Address saveAddress() {
		return new Address("Meerut", 203000);
	}
	@Bean
	public Course saveCourse() {
		return new Course("DAA", 45);
	}
	
	@Bean(name="stu1") 
	public Student saveStudent() {
		return new Student("ABC", saveAddress(), saveCourse());
	}
}
