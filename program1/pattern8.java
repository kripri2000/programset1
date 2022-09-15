package program1;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++)
				System.out.print('.');
			System.out.println();
		}
		for(int i=a-1;i>0;i--) {
			for(int j=i;j>0;j--)
				System.out.print('.');
			System.out.println();
		
		}
		
	}	

	}


