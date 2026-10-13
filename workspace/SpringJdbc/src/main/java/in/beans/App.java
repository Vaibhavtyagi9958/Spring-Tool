package in.beans;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.beans.resources.AppConfig;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeDAO dao = context.getBean(EmployeeDAO.class);
//        Employee emp = new Employee();
//        emp.setName("ajay");
//        emp.setAge(40);
//        int res = dao.updateEmployee(emp);
//        System.out.print(res);
        
        List<Employee> employees = dao.getAllEmployees();
        employees.forEach(e -> 
        	System.out.println(e.getName()+ " " +e.getAge() + " " + e.getSalary())
        );
        
        
    }
}
