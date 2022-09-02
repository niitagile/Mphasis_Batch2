package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springcrud.beans.Employee;
import com.springcrud.dao.EmployeeDao;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeDao dao;
	
	
	//show all records
	@RequestMapping(value="/viewemp", method=RequestMethod.GET)
	@ResponseBody
	public String viewemp(Model model){
		List<Employee> empList= dao.getEmployeesDetails();
		
		model.addAttribute("empList",empList);
		return "viewemp";
	}
	
		//Show Empty form
	@RequestMapping(value="/empform", method=RequestMethod.GET)
	public String showForm(Model m){
	Employee emp=new Employee();
	m.addAttribute("emp", emp);
		
		return "empform";
	}
	
	//Save Record
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(@ModelAttribute("emp") Employee emp){
		dao.insert(emp);
	
	return "redirect:/viewemp";
	}
	
}
