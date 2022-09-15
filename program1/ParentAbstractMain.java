package program1;
abstract class ParentAbstract{
	abstract void message();
}
class FirstSub extends ParentAbstract{
	void message() {
		System.out.println("This is first subclass");
	}
}
class SecondSub extends ParentAbstract{
	void message() {
		System.out.println("This is second subclass");
	}
}

public class ParentAbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstSub f = new FirstSub();
		f.message();
		SecondSub s = new SecondSub();
		s.message();

	}

}
