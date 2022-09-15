package program1;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5],sum=0,product=1;
		System.out.println("Enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();	
			sum += arr[i];
			product *= arr[i];
		}
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+product);

	}

}
