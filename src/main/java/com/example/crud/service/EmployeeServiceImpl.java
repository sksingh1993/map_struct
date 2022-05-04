package com.example.crud.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.domain.Address;
import com.example.crud.domain.Car;
import com.example.crud.domain.Employee;
import com.example.crud.mapper.EmployeeObjectMapper;

@Service
public class EmployeeServiceImpl {
	@Autowired
	private EmployeeObjectMapper mapper;

	public com.example.crud.model.Employee t1() {
		Employee employee=new Employee();
		employee.setEmailAddress("Suraj@gmail.com");
		employee.setFirstName("Suraj");
		employee.setLastName("Singh");
		employee.setId(1L);
		Address address = new Address();
		address.setDistrict("Sitamarhi");
		address.setPincode(843302);
		address.setPost("Paktola");
		address.setState("Bihar");
		address.setVillage("Rikhauli");
		employee.setAddress(address);
		Car car1 =new Car();
		car1.setColor("Red");
		car1.setModelNumber("SUB");
		car1.setVehicleNumber("BR30");
		Car car2 =new Car();
		car2.setColor("Yellow");
		car2.setModelNumber("ABC");
		car2.setVehicleNumber("BR40");
		employee.setCars(Arrays.asList(car1,car2));
		com.example.crud.model.Employee employeeDomainToModel = mapper.employeeDomainToModel(employee);
		mapper.employeeModelToDomain(employeeDomainToModel);
		return employeeDomainToModel;
	}
}
