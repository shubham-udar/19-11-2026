package com.service;

import java.util.ArrayList;

import com.dao.EmployeeDao;
import com.entity.Employee;
import com.exception.EmployeeNotFounException;
import com.exception.EmployeesNotFoundException;
import com.exception.SomethingWentWrongException;

public class EmployeeService {

//	Business Logic
	EmployeeDao dao = new EmployeeDao();
	
	public String insertEmployee(Employee employee)
	{
		String msg=dao.insertEmployee(employee);
		
		return msg;
	}
	
	public String updateEmployee(Employee employee)
	{
		
		String msg=dao.updateEmployee(employee);
		
		if(msg==null)
		{
		
		throw new SomethingWentWrongException("Check Your Sql Query Again.....");
		
	    }
		
		return msg;
   }
	
	public String delete(int id)
	{
		String msg=dao.delete(id);
		
		if(msg==null)
		{
		
		throw new SomethingWentWrongException("Check Your Sql Query Again.....");
		
	    }
		
		return msg;
	}
	
//	public Employee getEmployee(int id)
//	{
//		Employee employee = dao.getEmployeeById(id);
//		
//		if(employee == null)
//		{
//			throw new EmployeeNotFounException("Employee Not Found with empId :"+id);
//		}
//		
//		return employee;
//	}
	
	public ArrayList<Employee>  getAllEmployee()
	{
		ArrayList<Employee> employees = dao.getAllEmployee();
		if(employees.isEmpty())
		{
			throw new EmployeesNotFoundException("No Employees Present in Database....");
		}
		return employees;
	}
	
}
