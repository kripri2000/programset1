package program1;

import java.util.Scanner;

public class PrimeFactor {
	public static boolean prime(int n) {
		int chck = 0;
	
		for(int i=2;i<=n/2;i++) {
			
			if(n%i == 0) {
					chck++;
					break;
				}
			}
			if(chck == 0) {
				return true;
			}
			return false;
	}
		
			
		

	public static void main(String[] args) {
		//int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		for(int i=2;i<=a/2;i++) {
			if(a%i == 0)
				if(prime(i)) 
					System.out.println(i);
			
		}
		

	}

}
