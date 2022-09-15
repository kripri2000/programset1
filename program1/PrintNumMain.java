package program1;
class PrintNum{
	void printn(int x)
	{
		System.out.println("Type int : "+x);
	}
	void printn(float x) {
		System.out.println("Type float : "+x);
	}
	void printn(double x) {
		System.out.println("Type double :"+x);
	}
	
	void printn(long x) {
		System.out.println("Type long :"+x);
	}
}

public class PrintNumMain {

	public static void main(String[] args) {
		PrintNum pobj = new PrintNum();
		pobj.printn(10);
		pobj.printn(3.24f);
		pobj.printn(1034.12345632);
		pobj.printn(10L);
		

	}

}
