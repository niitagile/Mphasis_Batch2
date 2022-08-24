package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.beans.Employee;
import com.springcrud.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	
	
	
	@RequestMapping("/viewemp")
	public String viewemp(Model m){
		List<Employee> empList= dao.getEmployeesDetails();
		/*for(Employee e : empList){
			System.out.println(e.getEid());
		}*/
		m.addAttribute("empList",empList);
		return "viewemp";
	}
	
		
	
	
}
