package com.main;

import java.util.ArrayList;

import com.Contrloller.EmployeeController;
import com.entity.Employee;
import com.exception.SomethingWentWrongException;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		 EmployeeController controller = new EmployeeController();
//		  
//         Employee e = new Employee(1,"shubham",25000,"IT","Male","pune");
//		 
//		 String msg = controller.insertEmployee(e);
//		 System.out.println(msg);
		 
//		 try
//		 {
//
//		 System.out.println(controller.delete(10));
//		 
//		 }catch(Exception e)
//		 {
//			 e.printStackTrace();
//		 }
		 
		 
//		 try
//		 {
//		 
//		 Employee employee= controller.getEmployeeById(121);
//		
//		 System.out.println(employee);
//		
//		 }catch(Exception e)
//		 {
////			 e.printStackTrace();
//			 System.out.println(e.getMessage());
//		 }
		 try
		 {
		 ArrayList<Employee> all= controller.getAllEmployee();
		 
		 for(Employee a:all)
		 {
			 System.out.println("Employee ID          :"+a.getEmpId());
			 System.out.println("Employee Name        :"+a.getEmpName());
			 System.out.println("Employee Salary      :"+a.getEmpSalary());
			 System.out.println("Employee Department  :"+a.getEmpDep());
			 System.out.println("Employee Gender      :"+a.getEmpgender());
			 System.out.println("employee City        :"+a.getEmpCity());
			 
			 System.out.println("********************************************");
		 }
		 }catch(Exception e)
		 {
			System.out.println(e.getMessage());
		 }
	}
}
