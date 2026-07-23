package Com.Constructors;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Employee emp = new Employee(3013, "Surya", "Developer", 50000, 5);

        System.out.println("Before Promotion");
        
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name       : " + emp.getName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary     : " + emp.getSalary());
        System.out.println("Performance Rating: " + emp.getPerformanceRating());

        emp.promoteEmployee();

        System.out.println("\nAfter Promotion");
        
        System.out.println("Employee ID: " + emp.getEmpId());
        System.out.println("Name       : " + emp.getName());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary     : " + emp.getSalary());
        System.out.println("Performance Rating: " + emp.getPerformanceRating());
	}

}
