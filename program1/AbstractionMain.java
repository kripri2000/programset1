package program1;

abstract class Mahesh{
	public void call() {
		System.out.println("Calling....");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}
abstract class Ramesh extends Mahesh{
	public void move() {
		System.out.println("Moving.....");
	}
}
class Suresh extends Ramesh{
	public void dance() {
		System.out.println("Dancing....");
	}
	public void cook() {
		System.out.println("Cooking....");
	}
	
}
public class AbstractionMain {

	public static void main(String[] args) {
		Mahesh m = new Suresh();
		m.call();
		m.move();
		m.dance();
		m.cook();

	}

}
