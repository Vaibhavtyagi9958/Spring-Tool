package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.dao.UserRepository;
import com.example.entity.Student1;

@SpringBootApplication
public class JpaExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(JpaExampleApplication.class, args);
		UserRepository u = context.getBean(UserRepository.class);
		
		Student1 user = new Student1("XYZ", "Modinagar");
		
		Student1 s = u.save(user);
		System.out.println(s);
	}

}
