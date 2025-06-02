package com.example.CRUD.service;

import com.example.CRUD.dto.EmployeeDto;
import com.example.CRUD.mapper.EmployeePopulator;
import com.example.CRUD.model.Employee;
import com.example.CRUD.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee saveEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeePopulator.INSTANCE.populateEmployee(employeeDto);
        return employeeRepository.save(employee);
    }
}
