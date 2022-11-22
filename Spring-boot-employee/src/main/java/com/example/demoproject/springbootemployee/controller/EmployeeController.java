package com.example.demoproject.springbootemployee.controller;

import com.example.demoproject.springbootemployee.exception.ResourceNotFoundException;
import com.example.demoproject.springbootemployee.model.Employee;
import com.example.demoproject.springbootemployee.repository.EmployeeRepository;
//import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();

    }

    //Create EMployee rest api
    @PostMapping("/employees")
    public Employee createEmployee( @RequestBody Employee employee){
        return employeeRepository.save(employee);

    }
    //Create get employee rest api
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeebyid(@PathVariable Long id){
        Employee employee= employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee id not found"+id));
        return ResponseEntity.ok(employee);
    }

    //Update Employee rest api
    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails){
        Employee employee= employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee id not found"+id));

        employee.setFirstname(employeeDetails.getFirstname());
        employee.setLastname(employeeDetails.getLastname());
        employee.setEmailid(employeeDetails.getEmailid());

        Employee updatedEmployee = employeeRepository.save(employee);

        return ResponseEntity.ok(updatedEmployee);

    }

    //Delete employee rest api
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Employee employee= employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee id not found"+id));
        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
