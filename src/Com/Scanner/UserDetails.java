package Com.Scanner;

import java.util.Scanner;

public class UserDetails {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Gender :");
		String Gender=sc.nextLine();
		
		System.out.print("Enter the Age :");
		int Age=sc.nextInt();
		
		if((Age >= 23 && Gender.equals("Female")) || 
				(Age >= 27 && Gender.equals("Male"))) {
			
			System.out.println("Eligible for voting");
			
		}else {
			System.out.println("Not eligible for voting");
		}
		
		sc.close();
		
	}

}
