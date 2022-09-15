package program1;
import java.util.*;
public class TenInt {

	public static void main(String[] args) {
		int a,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers : ");
		for(int i=0;i<10;i++) {
			a = sc.nextInt();
			sum += a;
		}
		System.out.println("Average = "+(float)sum/10);
		

	}

}
