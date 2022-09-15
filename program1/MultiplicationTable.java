package program1;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		System.out.print("Enter number : ");
		a = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+" x "+a+" = "+i*a);
	}
	
		
		

	}

}
