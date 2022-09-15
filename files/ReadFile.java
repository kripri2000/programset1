package files;
import java.io.*;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f = new File("sample1.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
		}

	}

