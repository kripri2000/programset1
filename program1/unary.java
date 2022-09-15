package program1;
import java.util.Scanner;

public class unary {

	public static void main(String[] args) {
		String ch;
		System.out.print("Enter the operator : ");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextLine();
		System.out.print("Enter the operand : ");
		//Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		switch(ch){
		case "-":
			System.out.println(-c);
			break;
			
		case "++":
			System.out.println("Postfix : "+ c++);
			System.out.println("Prefix : " + ++c);
			break;
			
		case "--":
			System.out.println("Postfix : "+ c--);
			System.out.println("Prefix : " + --c);
			break;
			
		case "!":
			System.out.println("Enter a number : ");
			int a = sc.nextInt();
			System.out.println(!(a>c));
			break;
			
		case "~":
			System.out.println(~c);
			break;
			
		default:
			System.out.println("Invalid Operator!");
		}
		
	
		
		

	}

}

