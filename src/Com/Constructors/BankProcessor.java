package Com.Constructors;
import java.util.Scanner;
public class BankProcessor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print(" Enter account number :");
		int accountnumber=sc.nextInt();
		sc.nextLine();
		
		System.out.print(" Enter account holder name:");
		String accountholder=sc.nextLine();
		
		System.out.print(" Enter current balance :");
		double balance=sc.nextDouble();
		
		BankAccount account = new BankAccount(accountnumber,accountholder,balance);
		// Creating BankAccount object

        System.out.println("Account number : " + account.getaccountnumber());
        System.out.println("Account Holder : " + account.getaccountholder());
        System.out.println("Current Balance : " + account.getbalance());

        // Deposit
        account.deposit(2000);

        // Withdraw
        account.withdraw(3000);


        System.out.println("\nUpdated Balance : " + account.getbalance());
	}

}
