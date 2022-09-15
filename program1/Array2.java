package program1;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10],a,f=0;
		System.out.println("Enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter the number to be searched : ");
		a = sc.nextInt();
		for(int i=0;i<10;i++) {
			if(arr[i] == a) {
				f=1;
				break;
			}
		}
		if(f == 1)
			System.out.println("Number present");
		else
			System.out.println("Number not present");


	}

}
