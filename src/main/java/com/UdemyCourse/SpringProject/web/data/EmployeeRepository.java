package com.UdemyCourse.SpringProject.web.data;

import com.UdemyCourse.SpringProject.buz.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
