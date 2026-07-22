package Com.Loops;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Limit : ");
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println("Even Numbers " +i);
				
			}
		}
			System.out.println();
			
			for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				System.out.println("odd Numbers " +i);
		
			}
		}
		
	}

}
