package com.Contrloller;

import java.util.ArrayList;

import com.entity.Employee;
import com.service.EmployeeService;

public class EmployeeController {

	EmployeeService service = new EmployeeService();
	
	public String insertEmployee(Employee employee)
	{
		String msg= service.insertEmployee(employee);
		return msg;
	}
	
	public String updateEmployee(Employee employee)
	{
		
		String msg=	service.updateEmployee(employee);
		
		return msg;
		
	}
	
	public String delete(int id)
	{
		return service.delete(id);
		
		
	}
	
//	public Employee getEmployeeById(int id)
//	{
//		return service.getEmployee(id);
//	}
	
	public ArrayList<Employee> getAllEmployee()
	{
		return service.getAllEmployee();
	}
	
}
