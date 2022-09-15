package program1;
class Bank{
	int balance;
	void getBalance() {
		System.out.println(0);
	}
}
class BankA extends Bank{
	
	void getBalance() {
		balance = 1000;
		System.out.println("Balance at BankA : $"+balance);
	}
}
class BankB extends Bank{
	void getBalance() {
		balance = 1500;
		System.out.println("Balance at BankB : $"+balance);
	}
}
class BankC extends Bank{
	void getBalance() {
		balance = 2000;
		System.out.println("Balance at BankC : $"+balance);
	}
}
public class BankMain {

	public static void main(String[] args) {
		BankA a = new BankA();
		a.getBalance();
		BankB b = new BankB();
		b.getBalance();
		BankC c = new BankC();
		c.getBalance();
	}

}
