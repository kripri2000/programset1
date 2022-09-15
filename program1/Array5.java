package program1;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[2][3];
		System.out.println("Enter the numbers:");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The numbers in 2D array :");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
