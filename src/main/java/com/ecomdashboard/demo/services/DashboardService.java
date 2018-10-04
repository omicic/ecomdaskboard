package com.ecomdashboard.demo.services;

import java.util.HashMap;
import java.util.List;

import com.ecomdashboard.demo.entity.EmployeeInformation;
import com.ecomdashboard.demo.entity.OrderCollectionsStatus;
import com.ecomdashboard.demo.entity.OrderRecieved;
import com.ecomdashboard.demo.entity.ProductCategory;

public interface DashboardService {

	HashMap<String, Object> getTodayRevenueDash();
	List<ProductCategory> getBestCategory();
	List<OrderRecieved> getAllOrderRecieved();
	List<OrderCollectionsStatus> getOrderCollection();
	List<EmployeeInformation> getAllEmployee();
	EmployeeInformation getEmployee(final String pk);
	
	EmployeeInformation addEmployee(EmployeeInformation employeeInformation);
	EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);
	void deleteEmployee(EmployeeInformation employeeInformation);
	
}
