package program1;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		int oddsum=0,evensum=0,digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		while(n>0)
		{
			digit = n%10;
			if(digit%2 == 0)
				evensum += digit;
			else
				oddsum += digit;
			n /= 10;
		}
		System.out.println("Odd digit sum = "+oddsum);
		System.out.println("Even digit sum = "+evensum);

	}

}
