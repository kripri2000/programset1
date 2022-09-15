package program1;
import java.util.Scanner;
public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no:of terms : ");
		int terms = sc.nextInt();
		int f = 0,s = 1,t;
		System.out.print(f+" "+s+" ");
		for(int i=3;i<=terms;i++){
			t = f+s;
			System.out.print(t+" ");
			f = s;
			s = t;
			
		}

	}

}
