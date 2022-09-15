package program1;

public class fact {

	public static void main(String[] args) {
		int fact = 1;
		for(int i=1;i<=4;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of 4 : "+fact);
	}

}
