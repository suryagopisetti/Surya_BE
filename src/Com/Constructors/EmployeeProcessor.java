package Com.Constructors;
import java.util.Scanner;
public class EmployeeProcessor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Designation : ");
        String designation = sc.nextLine();

        System.out.print("Enter Salary : ");
        double salary = sc.nextDouble();

        System.out.print("Enter Performance Rating (1-5) : ");
        int rating = sc.nextInt();
        
		Employee emp = new Employee(id,name , designation, salary, rating);

        System.out.println("\nBefore Promotion");
        
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name       : " + emp.getName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary     : " + emp.getSalary());
        System.out.println("Performance Rating: " + emp.getPerformanceRating());

        emp.promoteEmployee(5);

        System.out.println("\nAfter Promotion");
        
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary     : " + emp.getSalary());
	}

}
