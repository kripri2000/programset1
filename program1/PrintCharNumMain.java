package program1;
class PrintCharNum{
	public void printchar(int n,char ch) {
		System.out.println("Number : "+n+"\nCharacter : "+ch);
	}
	public void printchar(char ch,int n) {
		System.out.println("Number : "+n+"\nCharacter : "+ch);
	}
}
public class PrintCharNumMain {

	public static void main(String[] args) {
		PrintCharNum p = new PrintCharNum();
		p.printchar(2,'j');
		p.printchar('h', 8);

	}

}
