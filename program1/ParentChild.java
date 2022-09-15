package program1;

class Parent{
	public void show() {
		System.out.println("This is parent class");
	}
}
class Child extends Parent{
	public void show() {
		System.out.println("This is child class");
	}
}
public class ParentChild {

	public static void main(String[] args) {
		Parent pobj = new Parent();
		pobj.show();
		Child cobj = new Child();
		cobj.show();
		Parent p = new Child();
		p.show();

	}

}
