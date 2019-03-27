package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;
import com.example.demo.service.onetomany.EmployeeServiceOneToMany;
import com.example.demo.service.onetoone.bidirection.EmployeeBidService;

@RestController
public class HomeController {

	private final DemoService service;
	private final EmployeeBidService empBidService;
	private final EmployeeServiceOneToMany employeeServiceOneToMany;

	@Autowired
	public HomeController(DemoService service, EmployeeBidService empBidService,
			EmployeeServiceOneToMany employeeServiceOneToMany) {

		this.service = service;
		this.empBidService = empBidService;
		this.employeeServiceOneToMany = employeeServiceOneToMany;
	}

	@RequestMapping("/uni")
	public String employeeUni() {
		service.add();

		return "hello";
	}

	@RequestMapping("/bid")
	public String employeeBid() {
		empBidService.add();

		return "hello";
	}

	@RequestMapping("/many")
	public String employeeOneToMany() {
		employeeServiceOneToMany.save();

		return "hello";
	}

}
