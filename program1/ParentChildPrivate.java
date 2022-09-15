package program1;
class Parent1{
	private void show() {
		System.out.println("This is parent class");
	}
}
class Child1 extends Parent1{
	public void show() {
		System.out.println("This is child class");
	}
}

public class ParentChildPrivate {

	public static void main(String[] args) {
		Parent1 pobj = new Parent1();
		//pobj.show();
		Child1 cobj = new Child1();
		cobj.show();

	}

}
