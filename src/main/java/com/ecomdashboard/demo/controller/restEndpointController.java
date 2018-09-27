package com.ecomdashboard.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecomdashboard.demo.entity.EmployeeInformation;
import com.ecomdashboard.demo.services.DashboardServiceImpl;

@RestController
public class restEndpointController {
	
	@Autowired
	private DashboardServiceImpl dashboardService;
	
	@RequestMapping("/employees")
	public List<EmployeeInformation> getAllEmp(){
		return dashboardService.getAllEmployee();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/employee/add")
	public String saveEmployeeInfo(@RequestBody EmployeeInformation employeeInformation) {
		if(dashboardService.addEmployee(employeeInformation) != null) {
			return "Employee data saved successfully";
		} else {
			return "Error saving employee info";
		}	
	
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employee/delete") //http://localhost:8080/employee/delete?empId=1 
	public String deleteEmp(@RequestParam(name="empId", required = true) String pk) {
		try {
		dashboardService.deleteEmployee(dashboardService.getEmployee(pk));
		return "deleted";
		} catch(Exception e) {
			return "error";
		}
		}
	
}
