package files;
import java.io.File;

public class ExistFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("samp.txt");
		if(f.exists()) 
			System.out.println("File exists");
		
		else
			System.out.println("File doesnot exist");

	}

}
