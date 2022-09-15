package files;
import java.io.IOException;
import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
			FileWriter f = new FileWriter("sample.txt");
			f.write("Hello World");
			f.write("\nThis is a new file");
			f.close();

	}

}
