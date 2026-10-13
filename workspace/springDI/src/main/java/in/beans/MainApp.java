package in.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu = (Student) context.getBean("stu1");
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
	}

}
