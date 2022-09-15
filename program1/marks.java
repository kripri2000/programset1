package program1;
import java.util.*;
public class marks {

	public static void main(String[] args) {
		int marks;
		do {
			System.out.println("Enter the marks : ");
			Scanner sc = new Scanner(System.in);
			marks = sc.nextInt();
			if(marks>=70)
				System.out.println("Honors");
			else if(marks>60 && marks<70)
				System.out.println("First Division");
			else if(marks>50 && marks<60)
				System.out.println("Second Divison");
			else if(marks>40 && marks<50)
				System.out.println("Third Division");
			else
				System.out.println("Failed");
		}while(true);
		
	}

}


