package Com.Scanner;
import java.util.Scanner;
public class BankMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Customer Name :");
		String custromerName=sc.nextLine();
		
		System.out.print("Enter the Customer Address :");
		String CustomerAddress=sc.nextLine();
		
		System.out.print("Enter the Phone Number :");
		long PhoneNumber=sc.nextLong();
		
		System.out.print("Enter the Balance :");
		double balance=sc.nextDouble();
		
		BankApplication bankapplication= new BankApplication(custromerName,
				CustomerAddress,PhoneNumber,balance);
		
				 boolean status = true;
		 while(status) {
			 System.out.println("*** Select an Option from Below ****\r\n"
						+"1. Withdraw\r\n"
						+"2. Deposit\r\n"  
						+"3. Show Balance\r\n"  
						+"4. Exit\r\n "
						+ "Enter your option [1-4]:)\r\n"
						+""); 
			 int options = sc.nextInt();
		 switch (options) {
			case 1:{
				System.out.print("Enter withdraw amount :");
				double amount=sc.nextDouble();
				bankapplication.withdraw(amount);
				System.out.println("withdraw Success ");
				break;
			}
			case 2:{
				System.out.print("Enter deposit amount :");
				double amount=sc.nextDouble();
				bankapplication.deposit(amount);
				System.out.println("deposit Success ");
				break;
			}
			case 3:{
				bankapplication.showbalance();
				break;
			}
			case 4:{
				System.out.println("Thank you !");
				status=false;
				break;
			}
			
			default:
				System.err.println("Invalid options");
				break;
			
			
			}
		 }
		 
		
	}

}
