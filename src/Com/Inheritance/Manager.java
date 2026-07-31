package Com.Inheritance;

public class Manager extends Employee {
	
	double bonus=20000; 
	
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		System.out.println("Salary       :"+manager.sal);
		System.out.println("Bonus        :"+manager.bonus);
		System.out.println("Total salary :"+manager.sal+manager.bonus);
		
		
	}

}
