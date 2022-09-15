package program1;

import java.util.Scanner;

public class greatest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		if(a>b) {
			System.out.print(a+" is the greatest");
		}
		else {
			System.out.print(b+" is the greatest");

		}

	}

}
