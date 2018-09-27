package com.ecomdashboard.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomdashboard.demo.entity.CompanyRevenue;
import com.ecomdashboard.demo.entity.EmployeeInformation;
import com.ecomdashboard.demo.entity.OrderCollectionsStatus;
import com.ecomdashboard.demo.entity.OrderRecieved;
import com.ecomdashboard.demo.entity.ProductCategory;
import com.ecomdashboard.demo.repositories.CompanyRevenueRepository;
import com.ecomdashboard.demo.repositories.EmployeeInformationRepository;
import com.ecomdashboard.demo.repositories.OrderCollectionStatusRepository;
import com.ecomdashboard.demo.repositories.OrderRecievedRepository;
import com.ecomdashboard.demo.repositories.ProductCategoryRepository;


@Service
public class DashboardServiceImpl implements DashboardService{
	
	@Autowired
	private CompanyRevenueRepository companyRevenueRepository;

	@Autowired
	private EmployeeInformationRepository employeeInformationRepository;

	@Autowired
	private OrderCollectionStatusRepository orderCollectionStatusRepository;

	@Autowired
	private OrderRecievedRepository orderRecievedRepository;

	@Autowired
	private ProductCategoryRepository productCategoryRepository;

	
	
	@Override
	public List<CompanyRevenue> getTodayRevenueDash() {
		return companyRevenueRepository.findAll();
	}

	@Override
	public List<ProductCategory> getBestCategory() {
		return productCategoryRepository.findByBestCategory(true);
	}

	@Override
	public List<OrderRecieved> getAllOrderRecieved() {
		// TODO Auto-generated method stub
		return orderRecievedRepository.findAll();
	}

	@Override
	public List<OrderCollectionsStatus> getOrderCollection() {
		// TODO Auto-generated method stub
		return orderCollectionStatusRepository.findAll();
	}

	@Override
	public List<EmployeeInformation> getAllEmployee() {
		return employeeInformationRepository.findAll();
	}

	@Override
	public EmployeeInformation addEmployee(EmployeeInformation employeeInformation) {
		return employeeInformationRepository.save(employeeInformation);
	}

	@Override
	public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
		return employeeInformationRepository.save(employeeInformation);
	}

	@Override
	public void deleteEmployee(EmployeeInformation employeeInformation) {
		employeeInformationRepository.delete(employeeInformation);
	}

	@Override
	public EmployeeInformation getEmployee(String pk) {
		return employeeInformationRepository.findByPk(pk);
	}
}
