package program1;
class Print{
	void print(int a)
	{
		System.out.println("Area of square = "+(a*a));
	}
	void print(int l,int b) {
		System.out.println("Area of rectangle = "+(l*b));
	}
}
public class PrintArea {
	
	
	public static void main(String[] args) {
		Print p = new Print();
		p.print(5);
		p.print(9,6);

	}

}
