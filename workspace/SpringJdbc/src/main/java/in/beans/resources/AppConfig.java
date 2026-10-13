package in.beans.resources;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.beans.EmployeeDAO;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

@Configuration
public class AppConfig {
 @Bean
 public DataSource datasource() {
	 DriverManagerDataSource ds = new DriverManagerDataSource();
	 ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	 ds.setUrl("jdbc:mysql://localhost:3306/employeedata");
	 ds.setUsername("root");
	 ds.setPassword("root");
	 return ds;
 }
 
 @Bean
 public JdbcTemplate jdbcTamplate(DataSource ds) {
	 return new JdbcTemplate(ds);
 }
 
 @Bean
 public EmployeeDAO employeeDAO(JdbcTemplate jdbcTemplate) {
	 return new EmployeeDAO(jdbcTemplate);
 }
	
}
