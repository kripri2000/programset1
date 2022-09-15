package files;
import java.io.File;
import java.io.IOException;
public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("sample1.txt");
		boolean check = f.createNewFile();
		if(check)
			System.out.println("File Created Successfully");
		else
			System.out.println("File already exists");


}}
