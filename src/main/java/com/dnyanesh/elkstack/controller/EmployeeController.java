package com.dnyanesh.elkstack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnyanesh.elkstack.beans.Employee;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/employee")
@Slf4j
public class EmployeeController {

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		Employee employee = new Employee(id, "Peter", 100000L);
		log.info("Employee details found " + employee);
		return employee;
	}
}
