package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.entity.Employee;
import com.jdbcConnection.JDBCUtil;

public class EmployeeDao {

	Connection con =JDBCUtil.createConnection();
	
	//create Table
	
//	public void createTable()
//	{
//		
//     try
//     {
//    	 
//	 Statement st=con.createStatement();
//	 
//	 st.execute("create table employees(empId int,"
//	 		+ "empName varchar(34)"
//	 		+ ",empSalary double,"
//	 		+ "empDep varchar(34),"
//	 		+ "empgender varchar(34),"
//	 		+ "empCity varchar(34))");
//	 
//	 System.out.println("Table created...");
//	 
//     }catch(Exception e)
//     {
//    	e.printStackTrace(); 
//     }
//     
//	}
	
//	public void insertEmployee(Employee employee)
//	{
//		try
//		{
//			
//		Statement st =con.createStatement();
//		st.execute("insert into employees values('"+employee.getEmpId()+"','"+employee.getEmpName()+"', '"+employee.getEmpSalary()+"', '"+employee.getEmpDep()+"','"+employee.getEmpgender()+"','"+employee.getEmpCity()+"')");
//		        System.out.println("Table Value Inserted.......");
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//	}
//	 Recomanded Using PrepareStatement
	public String insertEmployee(Employee employee)
	{
		try
		{
			
//		Statement st =con.createStatement();
			PreparedStatement pst=con.prepareStatement("insert into employees values(?,?,?,?,?,?)");
			pst.setInt(1, employee.getEmpId());
			pst.setString(2, employee.getEmpName());
			pst.setDouble(3, employee.getEmpSalary());
			pst.setString(4, employee.getEmpDep());
			pst.setString(5, employee.getEmpgender());
			pst.setNString(6, employee.getEmpCity());
			
			pst.execute();
			

//		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return "Employee Inserted SucessFully";
	}
	
//	update  Employee
	
	public String updateEmployee(Employee employee)
	{
		try
		{
		PreparedStatement pst=con.prepareStatement("update employees set empName=?,empSalary=?,empDep=?,empgender=?,empCity=? where empId=?");
		pst.setString(1, employee.getEmpName());
		pst.setDouble(2, employee.getEmpSalary());
		pst.setString(3, employee.getEmpDep());
		pst.setString(4, employee.getEmpgender());
		pst.setString(5, employee.getEmpCity());
		pst.setInt(6,   employee.getEmpId());
		
	    int value=	pst.executeUpdate(); //insert update delete
		
	    if(value > 0)
	    {
	    	return "Employee Updated SucessFully..";
	    }
	   
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	public String delete(int id)
	{
		
		try
		{
		
		PreparedStatement pst=con.prepareStatement("delete from employees where  empId=?");
		pst.setInt(1, id);
		
		int value=pst.executeUpdate();
		
		if(value >0)
		{
			return "Employee Deleted SucessFully...";
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
//	get singal Employee
	
//	public Employee getEmployeeById(int id)
//	{
////		ArrayList<Employee> employee = new ArrayList<Employee>();
//		
//		Employee employee=null;
//		try
//		{
//			
//		PreparedStatement pst=con.prepareStatement("select * from employees where empId=?");
//		pst.setInt(1, id);
//		
//	    ResultSet rs = pst.executeQuery();
//	    
//	   while(rs.next()) { 
//	   int id1 = rs.getInt("empId");
//	   String name = rs.getString("empName");
//	   double salary = rs.getDouble("empSalary");
//	   String dep=  rs.getString("empDep");
//	   String Gender=  rs.getString("empgender");
//	   String city=  rs.getString("empCity");
//	   
//	     employee = new Employee(id1,name,salary,dep,Gender,city);
//	     
//	   }
//	    
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//		return employee;
//	}
	
	
	public ArrayList<Employee>  getAllEmployee()
	{
		ArrayList<Employee> employees= new ArrayList<Employee>();
		
		Employee employee=null;
		try
		{
			
		PreparedStatement pst=con.prepareStatement("select * from employees ");
		
		ResultSet rs = pst.executeQuery();
	    
		while(rs.next()) { 
			int id1 = rs.getInt("empId");
			String name = rs.getString("empName");
			double salary = rs.getDouble("empSalary");
			String dep=  rs.getString("empDep");
			String Gender=  rs.getString("empgender");
			String city=  rs.getString("empCity");
	   
	    employee = new Employee(id1,name,salary,dep,Gender,city);
	    employees.add(employee);
	     
	   }
	    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return employees;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}
	


