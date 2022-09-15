package program1;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5],large,small;
		System.out.println("Enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) 
			arr[i] = sc.nextInt();	
		large = arr[0];
		small = arr[0];
		for(int i=1;i<5;i++)
		{
			if(arr[i]>large)
				large = arr[i];
			if(arr[i]<small)
				small = arr[i];
		}
		System.out.println("Largest in the array : "+large);
		System.out.println("Smallest in the array : "+small);
		

	}

}
