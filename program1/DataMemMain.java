package program1;
class Super{
	int i;
	void printNum() {
		System.out.println(i);
	}
}
class Sub extends Super{
	int j;
	void printNum() {
		System.out.println(j);
	}
}
public class DataMemMain {

	public static void main(String[] args) {
		Sub s = new Sub();
		s.i = 10;
		s.j = 9;
		s.printNum();

	}

}
