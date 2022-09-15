package files;
import java.io.File;
import java.io.IOException;
public class DeleteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("example.txt");
		
			if(f.createNewFile())
				System.out.println("example.txt created successfully");
			else
				System.out.println("example.txt already exists");
		
		
			if(f.delete())
				System.out.println("File deleted");
			
			else 
				System.out.println("File couldnot be deleted");
		

	}

}
