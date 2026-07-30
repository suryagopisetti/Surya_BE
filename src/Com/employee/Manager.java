package Com.employee;

public class Manager {
	
	private String managerName;
	
	public Manager(String managerName) {
		this.managerName=managerName;
		
	}
	public String getmanagerName() {
		return managerName;
	}
	public void setmanagerName(String managerName) {
		this.managerName=managerName;
	}
	
	public void checkDetails(Employee employee ) {
		System.out.println("Employee Name :"+employee.getempName());
		System.out.println("Employee Name :"+employee.getempDesg());
		System.out.println("Employee Name :"+employee.getempId());
		System.out.println("Employee Name :"+employee.getempSal());
		double empSal=employee.getempSal();
		
		if(empSal>=30000 && empSal<=40000) {
			employee.setempSal(empSal+empSal*0.15);
			
		}else if(empSal>40000 && empSal<=50000) {
			employee.setempSal(empSal+empSal*0.10);
		}
		else if(empSal>50000 && empSal<=60000) {
			employee.setempSal(empSal+empSal*0.05);
		}else{
			System.out.println("No Incerment");
			
		}
	} 
	

}
