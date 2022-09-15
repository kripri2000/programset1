package exceptions;

public class StringIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		try {
			System.out.println(str.charAt(10));
		}
		catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException has occurred");
		}

	}

}
