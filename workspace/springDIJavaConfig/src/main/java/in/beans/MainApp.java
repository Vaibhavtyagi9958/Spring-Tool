package in.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.config.JavaConfig;
public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student stu = (Student) context.getBean("stu1");
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
		System.out.println(stu.getCourse());
		context.close();
	}

}
