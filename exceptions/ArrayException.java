package exceptions;

public class ArrayException {

	public static void main(String[] args) {
		
		int arr[] = new int[3];
		try {
			arr[9] = 10;
		}	
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array index out of bounds exception!");
		}

	}

}
