package program1;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print : ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++) {
			int c=a;
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c--;
			}
			System.out.println();
			
		}

	}

}
