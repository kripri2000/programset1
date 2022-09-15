package access_specifiers;
class A{
	private int a = 10;
	private void message() {
		System.out.println(a);
	}
}
public class PrivateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();
		//obj.message();

	}

}
