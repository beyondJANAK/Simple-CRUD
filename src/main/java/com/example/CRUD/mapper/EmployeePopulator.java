package com.example.CRUD.mapper;

import com.example.CRUD.dto.EmployeeDto;
import com.example.CRUD.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeePopulator {
    EmployeePopulator INSTANCE = Mappers.getMapper(EmployeePopulator.class);

    Employee populateEmployee(EmployeeDto employeeDto);
}
