package program1;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int a = sc.nextInt();
		int c = a-1;
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(" ");
			}
			c--;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		c=1;
		for(int i=1;i<=a-1;i++) {
			for(int j=1;j<=c;j++) {
				System.out.print(" ");
			}
			c++;
			for(int j=1;j<=2*(a-i)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
