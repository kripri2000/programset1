package program1;
import java.util.*;
public class age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int a = sc.nextInt();
		if(a>=18) {
			System.out.print("Eligible");
		}
		else {
			System.out.print("Not Eligible ");
		}

	}

}
