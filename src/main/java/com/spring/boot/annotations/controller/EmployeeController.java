package com.spring.boot.annotations.controller;

import com.spring.boot.annotations.beans.ComponentDemo;
import com.spring.boot.annotations.beans.DemoBean;
import com.spring.boot.annotations.config.MailProps;
import com.spring.boot.annotations.entity.Employee;
import com.spring.boot.annotations.loadingtype.LazyLoadingBean;
import com.spring.boot.annotations.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/myapp/api")
@PropertySource("classpath:custom.properties")
@Scope("singleton")
//@Scope("prototype")
public class EmployeeController {

    @Autowired
    //@Qualifier("employeeServiceImplV1") // there are two references
    private EmployeeService employeeService;

    @Autowired
    private LazyLoadingBean lazyLoadingBean;

    @Autowired
    private ComponentDemo componentDemo;

    @Autowired
    private DemoBean demoBean;

    @Value("${mail.from}")
    public String from;

    @Value("${mail.host}")
    public String host;

    @Value("${mail.port}")
    public String port;

    @Value("${message}")
    public String message2;

    @Autowired
    private MailProps mailProps;

    public EmployeeController(){
        System.out.println("Controller object created#######################################");
    }


    @PostMapping("/save")
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.saveEmployee(employee);
        return ResponseEntity.ok(savedEmployee);
    }

    @GetMapping("/find/{employeeId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer employeeId){
        String message = demoBean.getMessage("DemoBean Object created!!!!!!!!!!!!");
        System.out.println(message);
        System.out.println("Mail sent from: "+from+" to "+host+" using port "+port);
        System.out.println("Message: "+message2);
        System.out.println("Mail properties: "+ mailProps);
        Employee employeeInfo = employeeService.getEmployee(employeeId);
        return ResponseEntity.ok(employeeInfo);

    }

    @GetMapping("/findAll")
    public ResponseEntity<Iterable<Employee>> getAllEmployee(){
        Iterable<Employee> employees = employeeService.getAllEmployee();
        return ResponseEntity.ok(employees);
    }

}
