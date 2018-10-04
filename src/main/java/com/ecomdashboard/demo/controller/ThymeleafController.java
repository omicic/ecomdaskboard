package com.ecomdashboard.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecomdashboard.demo.services.DashboardService;

@Controller
public class ThymeleafController {
	
	@Autowired
	public DashboardService dashboardService;
	
	@GetMapping("/dashboard")
	public String getDashDetail(Model model) {
		
		model.addAttribute("cr", dashboardService.getTodayRevenueDash());
		model.addAttribute("ei", dashboardService.getAllEmployee());
		
		System.out.println("MODEL" + model.toString());//ok
		
		return "/dashboard";
	}

}
