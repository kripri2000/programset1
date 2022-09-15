package program1;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range : ");
		int a = sc.nextInt();
		System.out.print(2+" ");
		for(int i=3;i<=a;i++) {
			int chck = 0;
			for(int j=2;j<a/2;j++) {
				if(i%j==0) {
					chck++;
					break;
				}
			}
			if(chck == 0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
