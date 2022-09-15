package exceptions;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		try {
			System.out.println(str.charAt(1));
		}
		catch(NullPointerException ne) {
			System.out.println("Null pointer exception!");
		}

	}

}
