/**
 * 
 */
package com.azure.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.azure.training.model.Employee;
import com.azure.training.repository.EmployeeRepository;

/**
 * @author kamarnat
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public Iterable<Employee> getEmployees() {
		return empRepo.findAll();
	}
}
