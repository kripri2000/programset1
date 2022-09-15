package exceptions;

public class NullExcep1 {

	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException ne) {
			System.out.println("Null pointer exception!");
		}

	}

}
