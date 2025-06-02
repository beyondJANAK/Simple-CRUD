package com.example.CRUD.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor @Getter
@Setter
public class EmployeeDto {
    private int id;
    private String name;
    private int age;
    private String emailAddress;
    private Integer projectId;
}
