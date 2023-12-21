package com.UdemyCourse.SpringProject.web.controller;

import com.UdemyCourse.SpringProject.buz.model.Employee;
import com.UdemyCourse.SpringProject.web.data.EmployeeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class WebController {
//    private String test;

    EmployeeRepository employeeRepository;

    public WebController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        System.out.println("Constructor called");

    }

    @ModelAttribute("responseEmployee")
    public Iterable<Employee> employeeList() {
        return employeeRepository.findAll();
    }

    @ModelAttribute
    public Employee employee() {
        Employee a =new Employee();
        a.setFirstName("Jacke");
        return a;
    }

    @GetMapping
    public String getEmployees() {
//        return the actual page to open in templates
        return "employees";
    }

    @PostMapping
    public String saveEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "redirect:employees";
    }
}
