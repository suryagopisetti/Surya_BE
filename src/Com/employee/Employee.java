package Com.employee;

public class Employee {
	
	private String empName;
	private String empDesg;
	private int empId;
	private double empSal;
	
	public Employee(String empName,String empDesg,
			int empId,double empSal) {
		this.empName=empName;
		this.empDesg=empDesg;
		this.empId=empId;
		this.empSal=empSal;
		
	}
	
	// getters
	public String getempName() {
		return empName;
	}
	public String getempDesg() {
		return empDesg;
	}
	public int getempId() {
		return empId;
	}
	public double getempSal() {
		return empSal;
	}
	
	//setters
	public void setempName(String empName) {
		this.empName=empName;
	}
	public void setempDesg(String empDesg) {
		this.empDesg=empDesg;
	}
	public void setempId(int empId) {
		this.empId=empId;
	}
	public void setempSal(double empSal) {
		this.empSal=empSal;
	}

}
