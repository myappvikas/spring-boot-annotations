package com.spring.boot.annotations;

import com.spring.boot.annotations.entity.Employee;
import com.spring.boot.annotations.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotationsExamplesApplication implements CommandLineRunner {

	@Autowired
	//@Qualifier("employeeServiceImplV1")
	private EmployeeService employeeService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationsExamplesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Employee employee = new Employee();
		employee.setEmployeeName("Vikas");
		employee.setAddress("Varanasi");
		employee.setCompanyName("Capgemini");
		employee.setSalary(100000l);

		Employee savedEmployee = employeeService.saveEmployee(employee);
		System.out.println(savedEmployee);


	}
}
