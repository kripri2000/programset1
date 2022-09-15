package exceptions;
public class MultipleCatch {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		/*int data;
		int arr[] = new int[3];*/
		String str = null;
		try {
			//data = 100/0;
			/*System.out.println("In try");
			arr[4] = 10;*/
			System.out.println(str.equals("hello"));
		}
		/*catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception has occurred");
		}*/
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception has occurred");
		}
		catch(NullPointerException ne){
			System.out.println("Null pointer exception has occurred");

		}
		
		

	}

}
