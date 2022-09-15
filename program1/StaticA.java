package program1;
class A{
	static void print() {
		System.out.println("Parent");
	}
}
class B extends A{
	static void print() {
		System.out.println("Child");
	}
}
public class StaticA {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		B b = new B();
		b.print();
		A obj = new B();
		obj.print();
	}

}
