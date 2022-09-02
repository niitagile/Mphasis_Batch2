package com.springcrud.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import com.springcrud.beans.Employee;


@Component //it means spring container will take care bean creation
public class EmployeeDao {
	
	@Autowired
	JdbcTemplate template; //fetch object from spring-servlet.xml
	
	
		public List<Employee> getEmployeesDetails(){
		String sql="select * from Employee";
		List<Employee>empList=template.query(sql,new EmployeeMapper());
		return empList;
	}
	
		public int insert(Employee emp){
			String sql="insert into Employee(eid,name,designation,salary)values(?,?,?,?)";
			int ans=template.update(sql,emp.getEid(),emp.getName(),emp.getDesignation(),emp.getSalary());
			return ans;
		}

	
}
