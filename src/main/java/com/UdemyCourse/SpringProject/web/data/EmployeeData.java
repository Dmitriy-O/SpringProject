package com.UdemyCourse.SpringProject.web.data;

import com.UdemyCourse.SpringProject.buz.model.Employee;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Component
public class EmployeeData implements ApplicationRunner {
    EmployeeRepository employeeRepository;

    public EmployeeData(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (employeeRepository.count() == 0) {
//            List<Employee> employeeList = List.of(
//                    new Employee(null, "Nickie", "Mine","dummy@gmail.com", LocalDate.of(1993, 10, 11), BigDecimal.valueOf(10000.16)),
//                    new Employee(null, "Jack", "Loeaf","dummy@gmail.com", LocalDate.of(1995, 10, 19), BigDecimal.valueOf(30000.1429)),
//                    new Employee(null, "Donald", "line","dummy@gmail.com", LocalDate.of(1985, 8, 11), BigDecimal.valueOf(16500.211)),
//                    new Employee(null, "Joe", "McCartney","dummy@gmail.com", LocalDate.of(1999, 5, 11), BigDecimal.valueOf(151745.36)),
//                    new Employee(null, "Mike", "Joenes","dummy@gmail.com", LocalDate.of(1999, 1, 11), BigDecimal.valueOf(897124.55))
//            );
//            employeeRepository.saveAll(employeeList);
        }
    }
}
