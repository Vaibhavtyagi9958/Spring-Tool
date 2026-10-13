package in.beans;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAO {
	private final JdbcTemplate jdbcTemplate;
	
	public EmployeeDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int saveEmployee(Employee e) {
		String sql = "Insert into employee(name, salary, age) values (?,?, ?)";
		return jdbcTemplate.update(sql, e.getName(), e.getSalary(), e.getAge());
	}
	public int updateEmployee(Employee e) {
		String sql = "update employee set name=? where age=?";
		return jdbcTemplate.update(sql, e.getName(), e.getAge());
	}
	public List<Employee> getAllEmployees() {
		String sql = "select * from employee";
		return jdbcTemplate.query(sql, new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setAge(rs.getInt("age"));
				e.setName(rs.getString(1));
				e.setSalary(rs.getInt(3));
				return e;
			}
		});
	}
}
