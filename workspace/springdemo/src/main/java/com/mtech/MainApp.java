package com.mtech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml"); 

//            StudentService studentService = (StudentService) context.getBean("studentService");
//            studentService.enrollStudent("Rajeev");
            
            HelloWorld hw = (HelloWorld) context.getBean("helloBean");
            hw.displayMessage();
    }
}