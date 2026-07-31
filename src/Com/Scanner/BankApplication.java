package Com.Scanner;

public class BankApplication {
	private String custormerName;
	private String custormerAddress;
	private long phoneNumber;
	private double balance;
	
	public BankApplication(String custormerName,
			String custormerAddress,long phoneNumber,double balance) {
		this.custormerName=custormerName;
		this.custormerAddress=custormerAddress;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
		System.out.println("Account Created Successfully......");
	}
	public void deposit(double amount) {
		if(amount>0) {
			this.balance+=amount;
			System.out.println("current balance :"+balance);
		}else {
			System.out.println("enter valid amount.....");
		}
		
	}
public void withdraw(double amount) {
	if(balance>=amount&&amount>0) {
		this.balance-=amount;
		System.out.println("After withdraw balance :"+balance);
	}else {
		System.out.println("insufficient balance...");
		
	}
		
	}
public void showbalance() {
	System.out.println("current balance :"+ this.balance);
}


public String getcustormerName() {
	return custormerName;
}
public void setcustormerAddress(String custormerName) {
	this.custormerName=custormerName;
}
public String getcustormerAddress() {
	return custormerAddress;
}
public void setcustormerName(String custormerAddress) {
	this.custormerAddress=custormerAddress;

}
public long getphoneNumber() {
	return phoneNumber;
}
public void setphoneNumber(long phoneNumber) {
	this.phoneNumber=phoneNumber;

}
public double getbalance() {
	return balance;
}
public void setbalance(double balance) {
	this.balance=balance;

}

}
