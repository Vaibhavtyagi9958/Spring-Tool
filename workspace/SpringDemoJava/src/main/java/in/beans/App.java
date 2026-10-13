package in.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.config.JavaConfig;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student obj = (Student) context.getBean("std2");
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        System.out.println(obj.getMarks());
    }
}
