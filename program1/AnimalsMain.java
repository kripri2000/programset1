package program1;
abstract class Animals{
	abstract void cats();
	abstract void dogs();
}
class Cats extends Animals{
	void cats(){
		System.out.println("Cats meow");
	}
	void dogs() {}
}
class Dogs extends Animals{
	void cats() {}
	void dogs(){
		System.out.println("Dogs bark");
	}
}
public class AnimalsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cats c = new Cats();
		//c.cats();
		Cats c = new Cats();
		Dogs d = new Dogs();		
		c.cats();
		d.dogs();

	}

}
