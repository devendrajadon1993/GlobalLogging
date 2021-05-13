package com.employee.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exception.ErrorMessage;
import com.employee.service.EmployeeService;
import com.employee.utility.CommonConstants;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value = "Employee", description = "Employee management APIs", tags = {"Employee" })
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/v1/employee")
	@ApiOperation(value = "Add new employee", notes="API will create new employee.")
	@ApiResponses(value = {@ApiResponse(code = 200, message = "Employee has been created successfully."),  @ApiResponse(code = 400, message = CommonConstants.MESSAGE_400,response=ErrorMessage.class), @ApiResponse(code = 500, message = CommonConstants.MESSAGE_500,response=ErrorMessage.class)})
	public void createEmployee(@Valid @RequestBody Employee emp) throws MethodArgumentNotValidException{
		
		employeeService.createEmployee(emp);
	}
		
}
