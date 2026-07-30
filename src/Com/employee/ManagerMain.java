package Com.employee;

import java.util.Scanner;
public class ManagerMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Name:");
		String empName=sc.nextLine();
		
		System.out.print("Enter the Desg:");
		String empDesg=sc.nextLine();
		
		System.out.print("Enter the Id:");
		int empId=sc.nextInt();
		
		System.out.print("Enter the Salary:");
		double empSal=sc.nextDouble();
		
		Employee emp=new Employee(empName,empDesg,empId,empSal);
		sc.nextLine();
		
		System.out.print("\nEnter the ManagerName:");
		String managerName=sc.nextLine();
		
		Manager manager=new Manager(managerName);
		
		manager.checkDetails(emp);
		
		System.out.println("\nUpdated Salary :"+emp.getempSal());
		
	}

}
