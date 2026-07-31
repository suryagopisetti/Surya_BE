package Com.Scanner;
import java.util.Scanner;
public class UserLodin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int attempts=0;
		do{ 
			System.out.print("Enter the Name :");
			String Name=sc.nextLine();
			
			System.out.print("Enter the Password :");
			String Password=sc.nextLine();
			
			if(Name.equals("admin@123") && Password.equals("admin123")) {
				System.out.println("login success");
				break;
		}else {
			attempts++;
			System.out.println("you have a :"+(3-attempts)+"left");
			
		}
		}while(attempts<3);
		
		if(attempts==3) {
			System.out.println("we have to try after 24 hours");
			
		}
			
		}
		
	}
