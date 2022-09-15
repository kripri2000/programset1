package program1;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		int arr[] = new int[10];
		System.out.println("Enter the numbers : ");
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("The numbers : ");
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
			
		}
		
	}

}
