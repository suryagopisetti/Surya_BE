package Com.Constructors;

public class Employee {
	 private int empId;
	    private String name;
	    private String designation;
	    private double salary;
	    private int performanceRating;
	    
	    //Parameterized Constructor to initialize all attributes.

	    public Employee(int empId, String name, String designation, double salary, int performanceRating) {
	        this.empId = empId;
	        this.name = name;
	        this.designation = designation;
	        this.salary = salary;
	        this.performanceRating = performanceRating;
	    }
         // getters
	    public int getEmpId() {
	        return empId;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getDesignation() {
	        return designation;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public int getPerformanceRating() {
	        return performanceRating;
	    }
	    // setters

	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    //method

	    public void promoteEmployee() {
	        if (performanceRating >= 4) {
	            salary = salary + (salary * 0.20);
	            designation = "Senior " + designation;
	        } else {
	            System.out.println("No Promotion");
	        }
	    }

}
