package com.example.crud.mapper;

import org.mapstruct.Mapper;

import com.example.crud.domain.Employee;
@Mapper(componentModel = "spring")
public interface EmployeeObjectMapper {
	
	com.example.crud.model.Employee employeeDomainToModel(Employee employee);
	
	Employee employeeModelToDomain(com.example.crud.model.Employee employee);

}
