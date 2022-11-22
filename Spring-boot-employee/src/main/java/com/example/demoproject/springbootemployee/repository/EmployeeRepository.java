package com.example.demoproject.springbootemployee.repository;

import com.example.demoproject.springbootemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}