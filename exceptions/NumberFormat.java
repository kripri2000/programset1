
/* Number Format Exception occurs when a string of incorrect format is converted into a number value */

package exceptions;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "";
		try {
				int n = Integer.parseInt(str);
				System.out.println(n);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Number Format Exception has occurred");
		}

	}

}
