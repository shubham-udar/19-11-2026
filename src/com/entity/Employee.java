package com.entity;

public class Employee {

	private int empId ;
	
	private String empName;
	
	private String empgender;
	
	private String empCity;
	
	private double empSalary;
	
	private String empDep;
	
	
	public Employee(int empId, String empName, double empSalary, String empDep, String empgender, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empgender = empgender;
		this.empCity = empCity;
		this.empSalary = empSalary;
		this.empDep = empDep;
	}

	
	void Display()
	{
		System.out.println("Hi   Shubham...");
	}
	public int getEmpId()
	{
		return empId;
	}
	
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	
	public String getEmpName()
	{
		return empName;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	
	public String getEmpgender()
	{
		return empgender;
	}
	
	public void setEmpgender(String empgender)
	{
		this.empgender = empgender;
	}
	
	public double getEmpSalary()
	{
		return empSalary;
	}
	public void setEmpSalary(double empSalary)
	{
		this.empSalary = empSalary;
	}
	
	public String getEmpCity()
	{
		return empCity;
	}
	public void setEmpCity(String empCity)
	{
		this.empCity = empCity;
	}
	 public String getEmpDep()
	 {
		 return empDep;
	 }
	public void setEmpDep(String empDep)
	{
		this.empDep=empDep;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empgender=" + empgender + ", empCity=" + empCity
				+ ", empSalary=" + empSalary + ", empDep=" + empDep + "]";
	}
	
	
}
