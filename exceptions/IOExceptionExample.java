package exceptions;
import java.util.*;
import java.io.IOException;
import java.io.File;
public class IOExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				File f = new File("io.txt");
				Scanner sc = new Scanner(f);
				while(sc.hasNextLine()) {
					System.out.println(sc.nextLine());
				}
				
			}
		catch(IOException ioe) {
			System.out.println("IOException has occurred");
		}

	}

}
