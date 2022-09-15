package program1;
class Encapsulation{
	private String name;
	private int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation en = new Encapsulation();
		en.setName("Rahul");
		System.out.println(en.getName());
		en.setRollno(24);
		System.out.println(en.getRollno());

	}

}
