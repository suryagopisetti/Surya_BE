package Com.Loops;


import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println( "Enter a Number :" );
		int Number = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(Number+"x"+ i + "=" +(Number * i));
			
		}
		
	}

}
