package org.example.controller;

import org.example.dto.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@GetMapping("/greet")
	public String sayGoodMorning() {
		return "Good Morning!";
	}

	@PostMapping(value = "/name", consumes = { "application/json", "application/xml" }, produces = "text/plain")
	public String getEmployeeName(@RequestBody Employee employee) {
		System.out.println("Emp Object:::" + employee);
		return "Employee Name::-> " + employee.getName();
	}

}
